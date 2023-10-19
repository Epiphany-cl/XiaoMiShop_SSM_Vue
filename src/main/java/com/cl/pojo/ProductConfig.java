package com.cl.pojo;

import java.math.BigDecimal;

public class ProductConfig {
    private Integer productConfigId;

    private Integer productId;

    private String productConfig;

    private BigDecimal productPrice;

    public Integer getProductConfigId() {
        return productConfigId;
    }

    public void setProductConfigId(Integer productConfigId) {
        this.productConfigId = productConfigId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductConfig() {
        return productConfig;
    }

    public void setProductConfig(String productConfig) {
        this.productConfig = productConfig == null ? null : productConfig.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
}