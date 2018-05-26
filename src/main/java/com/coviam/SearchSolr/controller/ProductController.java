package com.coviam.SearchSolr.controller;

import com.coviam.SearchSolr.dto.ProductDto;
import com.coviam.SearchSolr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/search")
    public ResponseEntity<List<ProductDto>> searchProduct(@RequestParam String name){

        List<ProductDto>  productDtoList = productService.getProducts(name);


        return new ResponseEntity<>(productDtoList,HttpStatus.OK);

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addDocument(@RequestBody ProductDto productDto){

        return productService.saveDocument(productDto);

    }

}
