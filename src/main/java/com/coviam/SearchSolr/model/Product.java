package com.coviam.SearchSolr.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;
import org.springframework.stereotype.Component;

@SolrDocument(solrCoreName = "MySite")
public class Product {

    @Id
    private Long productId;
    @Indexed(name = "productName", type = "string")
    private String productName;
    @Indexed(name = "productDescription", type = "string")
    private String productDescription;
    @Indexed(name = "productBrandName", type = "string")
    private String productBrandName;
    @Indexed(name = "productCategoryName", type = "string")
    private String productCategoryName;
    @Field
    private String productImgUrl;

    public Product(Long productId, String productName, String productDescription, String productBrandName, String productCategoryName, String productImgUrl) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productBrandName = productBrandName;
        this.productCategoryName = productCategoryName;
        this.productImgUrl = productImgUrl;
    }

    public Product() {
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductBrandName() {
        return productBrandName;
    }

    public void setProductBrandName(String productBrandName) {
        this.productBrandName = productBrandName;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}

