package com.coviam.SearchSolr.dto;

public class ProductDto {

    private long productId;
    private String productCategoryName;
    private String productName;
    private String productImgUrl;
    private String productDescription;
    private String productBrandName;

    public ProductDto(long productId, String productCategoryName, String productName, String productImgUrl, String productDescription, String productBrandName) {
        this.productId = productId;//not to be displayed to user
        this.productCategoryName = productCategoryName;
        this.productName = productName;
        this.productImgUrl = productImgUrl;
        this.productDescription = productDescription;
        this.productBrandName = productBrandName;
    }

    public ProductDto() {
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public long getProductId() {
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
}
