package com.cl.pojo;

public class ShoppingCart {
    private Integer cartId;

    private Integer userId;

    private Integer productId;

    private Integer productQuantity;

    private Integer cartStauts;

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", productQuantity=" + productQuantity +
                ", cartStauts=" + cartStauts +
                '}';
    }

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

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getCartStauts() {
        return cartStauts;
    }

    public void setCartStauts(Integer cartStauts) {
        this.cartStauts = cartStauts;
    }
}