package com.coviam.SearchSolr.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "MySite")
public class Product {

    @Id
    private Long productID;
    @Indexed(name = "productCategoryName", type = "string")
    private String productCategoryName;
    @Indexed(name = "productName", type = "string")
    private String productName;
    @Indexed(name = "productDescription", type = "string")
    private String productDescription;
    @Indexed(name = "productBrandName", type = "string")
    private String productBrandName;
    @Field
    private String productImgUrl;
    @Field
    private double productPrice;
    @Field
    private long merchantID;
    @Indexed(name = "productMerchantName", type = "string")
    private String productMerchantName;
    @Field
    private int merchantCount;

    public Product() {
    }

    public Product(Long productID, String productCategoryName, String productName, String productDescription, String productBrandName, String productImgUrl, double productPrice, long merchantID, String productMerchantName, int merchantCount) {
        this.productID = productID;
        this.productCategoryName = productCategoryName;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productBrandName = productBrandName;
        this.productImgUrl = productImgUrl;
        this.productPrice = productPrice;
        this.merchantID = merchantID;
        this.productMerchantName = productMerchantName;
        this.merchantCount = merchantCount;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public long getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(long merchantID) {
        this.merchantID = merchantID;
    }

    public String getProductMerchantName() {
        return productMerchantName;
    }

    public void setProductMerchantName(String productMerchantName) {
        this.productMerchantName = productMerchantName;
    }

    public int getMerchantCount() {
        return merchantCount;
    }

    public void setMerchantCount(int merchantCount) {
        this.merchantCount = merchantCount;
    }
}


