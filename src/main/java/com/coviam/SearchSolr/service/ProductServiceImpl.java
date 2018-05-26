package com.coviam.SearchSolr.service;

import com.coviam.SearchSolr.dto.ProductDto;
import com.coviam.SearchSolr.model.Product;
import com.coviam.SearchSolr.repository.ProductRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<ProductDto> getProducts(String name) {

        List<Product> productList = productRepo.findByProductNameContainsOrProductDescriptionContainsOrProductBrandNameContainsOrProductCategoryNameContains(name,name,name,name);

        List<ProductDto> productDtoList = new ArrayList<>();



        for(Product product : productList){

            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product,productDto);
            productDtoList.add(productDto);
        }

        return productDtoList ;
    }

    @Override
    public boolean saveDocument(ProductDto productDto) {
         Product product = new Product();
         BeanUtils.copyProperties(productDto,product);

         if(productRepo.existsById(productDto.getProductId())){
             return false;
         }

         productRepo.save(product);
         return true;
    }



}
