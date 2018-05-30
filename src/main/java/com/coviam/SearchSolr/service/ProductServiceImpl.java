package com.coviam.SearchSolr.service;

import com.coviam.SearchSolr.dto.ProductDto;
import com.coviam.SearchSolr.dto.ResponseDto;
import com.coviam.SearchSolr.model.Product;
import com.coviam.SearchSolr.repository.ProductRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<ResponseDto> getProducts(String name) {
        /**
         * Tokenize before passing to repository
         */
        List<String> tokens = Arrays.asList(name.split(" "));
        List<Product> productList = productRepo.findByProductNameContainsOrProductDescriptionContainsOrProductBrandNameContainsOrProductCategoryNameContainsOrProductMerchantNameContains(tokens,tokens,tokens,tokens,tokens);

        List<ResponseDto> responseDtoList = new ArrayList<>();

        for(Product product : productList){

            ResponseDto responseDto = new ResponseDto();
            BeanUtils.copyProperties(product,responseDto);
            responseDtoList.add(responseDto);
        }

        return responseDtoList ;
    }

    @Override
    public boolean saveDocument(ProductDto productDto) {
         Product product = new Product();
         BeanUtils.copyProperties(productDto,product);

         if(productRepo.existsById(productDto.getProductID())){
             return false;
         }

         productRepo.save(product);
         return true;
    }


}
