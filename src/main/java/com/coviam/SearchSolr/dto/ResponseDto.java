package com.coviam.SearchSolr.dto;

public class ResponseDto {

    private long productID;
    private String productName;
    private String productImgUrl;
    private double productPrice;
    private long merchantID;
    private String productMerchantName;
    private int merchantCount;

    public ResponseDto(long productID, String productName, String productImgUrl, double productPrice, long merchantID, String productMerchantName, int merchantCount) {
        this.productID = productID;
        this.productName = productName;
        this.productImgUrl = productImgUrl;
        this.productPrice = productPrice;
        this.merchantID = merchantID;
        this.productMerchantName = productMerchantName;
        this.merchantCount = merchantCount;
    }

    public ResponseDto() {
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
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
