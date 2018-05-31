package com.coviam.SearchSolr.controller;

import com.coviam.SearchSolr.dto.ProductDto;
import com.coviam.SearchSolr.dto.ResponseDto;
import com.coviam.SearchSolr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/search")
    public ResponseEntity<List<ResponseDto>> searchProduct(@RequestParam String name) {

        List<ResponseDto> responseDtoList = productService.getProducts(name);
        try {
            return new ResponseEntity<>(responseDtoList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new ArrayList<ResponseDto>(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addDocument(@RequestBody ProductDto productDto) {
        return productService.saveDocument(productDto);

    }

    @RequestMapping(value = "/recommend")
    public List<String> reccomendProduct(@RequestParam String name) {
        return productService.reccomendProduct(name);

    }


}


