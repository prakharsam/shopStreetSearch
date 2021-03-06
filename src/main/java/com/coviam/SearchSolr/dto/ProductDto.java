package com.coviam.SearchSolr.dto;

public class ProductDto {

    private long productID;
    private String productCategoryName;
    private String productName;
    private String productDescription;
    private String productBrandName;
    private String productImgUrl;

    private double productPrice;
    private long merchantID;
    private String productMerchantName;
    private int merchantCount;

    public ProductDto(long productID, String productCategoryName, String productName, String productDescription, String productBrandName, String productImgUrl, double productPrice, long merchantID, String productMerchantName, int merchantCount) {
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

    public ProductDto() {
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
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
