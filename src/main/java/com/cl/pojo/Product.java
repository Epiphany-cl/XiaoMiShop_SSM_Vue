package com.cl.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer productId;

    private String productName;
    private String productSketch;

    private String productDescription;

    private BigDecimal productStratingPrice;

    private String productImgPath;

    private Integer productCategoryId;

    private Date productCreationTime;

    private Date productUpdateTime;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSketch() {
        return productSketch;
    }

    public void setProductSketch(String productSketch) {
        this.productSketch = productSketch == null ? null : productSketch.trim();
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public BigDecimal getProductStratingPrice() {
        return productStratingPrice;
    }

    public void setProductStratingPrice(BigDecimal productStratingPrice) {
        this.productStratingPrice = productStratingPrice;
    }

    public String getProductImgPath() {
        return productImgPath;
    }

    public void setProductImgPath(String productImgPath) {
        this.productImgPath = productImgPath == null ? null : productImgPath.trim();
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Date getProductCreationTime() {
        return productCreationTime;
    }

    public void setProductCreationTime(Date productCreationTime) {
        this.productCreationTime = productCreationTime;
    }

    public Date getProductUpdateTime() {
        return productUpdateTime;
    }

    public void setProductUpdateTime(Date productUpdateTime) {
        this.productUpdateTime = productUpdateTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productSketch='" + productSketch + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productStratingPrice=" + productStratingPrice +
                ", productImgPath='" + productImgPath + '\'' +
                ", productCategoryId=" + productCategoryId +
                ", productCreationTime=" + productCreationTime +
                ", productUpdateTime=" + productUpdateTime +
                '}';
    }
}