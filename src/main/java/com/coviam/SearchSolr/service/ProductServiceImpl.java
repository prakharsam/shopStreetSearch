package com.coviam.SearchSolr.service;

import com.coviam.SearchSolr.dto.ProductDto;
import com.coviam.SearchSolr.dto.ResponseDto;
import com.coviam.SearchSolr.model.Product;
import com.coviam.SearchSolr.repository.ProductRepo;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Pattern LESS_THAN = Pattern.compile("[a-z\\s]+ less than \\d+");
    private static final Pattern GREATER_THAN = Pattern.compile("[a-z\\s]+ greater than \\d+");

    private static final Pattern BETWEEN = Pattern.compile("[a-z\\s]+ between \\d+ and \\d+");


    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<ResponseDto> getProducts(String name) {
        /**
         * Tokenize before passing to repository
         */

        List<String> tokens = Arrays.asList(name.split(" "));
        List<ResponseDto> responseDtoList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();


        String category = tokens.get(0).replaceAll(" (less|greater) than \\d+", "");
        String categoryBetween = tokens.get(0).replaceAll(" between  \\d+ and \\d+", "");


        if(LESS_THAN.matcher(name).matches()){
            productList = productRepo.priceLessThan(category,Long.valueOf(tokens.get(tokens.size()-1)));
            return conversionProductToReponse(productList);
        }else if(GREATER_THAN.matcher(name).matches()){

            productList = productRepo.priceGreaterThan(category,Long.valueOf(tokens.get(tokens.size()-1)));

            return conversionProductToReponse(productList);

        }else if(name.contains("between")){

            productList = productRepo.priceBetween(categoryBetween,Long.valueOf(tokens.get(tokens.size()-3)),Long.valueOf(tokens.get(tokens.size()-1)));

//            productList = productRepo.priceBetween(tokens.get(0),Long.valueOf(tokens.get(tokens.size()-3)),Long.valueOf(tokens.get(tokens.size()-1)));

            return conversionProductToReponse(productList);
        }

        productList = productRepo.findByProductNameContainsOrProductDescriptionContainsOrProductBrandNameContainsOrProductCategoryNameContainsOrProductMerchantNameContains(tokens, tokens, tokens, tokens, tokens);
        responseDtoList = conversionProductToReponse(productList);


        return responseDtoList;
    }

    @Override
    public boolean saveDocument(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);

        if (productRepo.existsById(productDto.getProductID())) {
            return false;
        }

        productRepo.save(product);
        return true;
    }

    private List<ResponseDto> conversionProductToReponse(List<Product> productList)
    {
        List<ResponseDto> responseDtoList = new ArrayList<>();

        for (Product product : productList) {

            ResponseDto responseDto = new ResponseDto();
            BeanUtils.copyProperties(product, responseDto);
            responseDtoList.add(responseDto);
        }

        return responseDtoList;
    }


}
