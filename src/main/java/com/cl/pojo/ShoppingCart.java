package com.cl.pojo;

public class ShoppingCart {
    private Integer cartId;

    private Integer userId;

    private Integer productId;

    private Integer productConfigId;

    private Integer productColorId;

    private Integer productQuantity;

    private Integer cartStatus;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductConfigId() {
        return productConfigId;
    }

    public void setProductConfigId(Integer productConfigId) {
        this.productConfigId = productConfigId;
    }

    public Integer getProductColorId() {
        return productColorId;
    }

    public void setProductColorId(Integer productColorId) {
        this.productColorId = productColorId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(Integer cartStatus) {
        this.cartStatus = cartStatus;
    }
}