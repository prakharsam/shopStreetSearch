package com.coviam.SearchSolr.service;

import com.coviam.SearchSolr.dto.ProductDto;
import com.coviam.SearchSolr.dto.ResponseDto;

import java.util.List;

public interface ProductService {

    List<ResponseDto> getProducts(String name);

    boolean saveDocument(ProductDto productDto);

    List<String> reccomendProduct(String name);

}
