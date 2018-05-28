package com.coviam.SearchSolr.repository;

import com.coviam.SearchSolr.model.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends SolrCrudRepository<Product, Long> {

    List<Product> findByProductNameContainsOrProductDescriptionContainsOrProductBrandNameContainsOrProductCategoryNameContains(String productName,String productDescription,String productBrandName,String productCategoryName);

}
