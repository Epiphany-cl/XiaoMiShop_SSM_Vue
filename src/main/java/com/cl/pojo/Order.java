package com.cl.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String orderId;

    private Integer userId;

    private Integer productId;

    private Integer productConfigId;

    private Integer productColorId;

    private BigDecimal totalPrice;

    private Date orderCreateTime;

    private String orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }
}