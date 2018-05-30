package com.coviam.SearchSolr.repository;

import com.coviam.SearchSolr.model.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends SolrCrudRepository<Product, Long> {

    List<Product> findByProductNameContainsOrProductDescriptionContainsOrProductBrandNameContainsOrProductCategoryNameContainsOrProductMerchantNameContains(List<String> productName,List<String> productDescription,List<String> productBrandName,List<String> productCategoryName,List<String> productMerchantName);

}
