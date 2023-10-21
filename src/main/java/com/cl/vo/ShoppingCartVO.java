package com.cl.vo;

import com.cl.pojo.ShoppingCart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartVO {
    private ShoppingCart shoppingCart;
    private Integer cartId;
    private Integer cartStatus;// 0: 未选择
    private String productImg;
    private String productName;
    private BigDecimal productPrice;
    private Integer productQuantity;
}
