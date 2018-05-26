package com.coviam.SearchSolr.service;

import com.coviam.SearchSolr.dto.ProductDto;
import com.coviam.SearchSolr.model.Product;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts(String name);

    boolean saveDocument(ProductDto productDto);

}
