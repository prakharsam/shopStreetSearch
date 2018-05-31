package com.coviam.SearchSolr.repository;

import com.coviam.SearchSolr.model.Product;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends SolrCrudRepository<Product, Long> {

    List<Product> findByProductNameContainsOrProductDescriptionContainsOrProductBrandNameContainsOrProductCategoryNameContainsOrProductMerchantNameContains(List<String> productName, List<String> productDescription, List<String> productBrandName, List<String> productCategoryName, List<String> productMerchantName);

    @Query("productPrice:[* TO ?1] AND productCategoryName : *?0* ")
    List<Product> priceLessThan(String productCategoryName, long productPrice);


    @Query("productPrice:[?1 TO *] AND productCategoryName : *?0*")
    List<Product> priceGreaterThan(String productCategoryName, long productPrice);


    @Query("productPrice:[?1 TO ?2] AND productCategoryName : *?0*")
    List<Product> priceBetween(String productCategoryName, long minPrice, long maxPrice);

    List<Product> findByProductNameContainsOrProductBrandNameContainsOrProductCategoryNameContains(List<String> productName, List<String> productBrandName, List<String> productCategoryName);


}
