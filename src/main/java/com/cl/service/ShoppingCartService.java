package com.cl.service;

import com.cl.pojo.ShoppingCart;
import com.cl.vo.ShoppingCartVO;

import java.util.List;

public interface ShoppingCartService {
    boolean addShoppingCart(ShoppingCart shoppingCart);

    List<ShoppingCartVO> getShoppingCartByUserId(Integer userId);

    boolean changeProductStatusByCartId(Integer cartId);

    boolean changeAllStatusByUserId(Boolean selectAllStatus, Integer userId);

    boolean deleteShoppingCartByCartId(Integer cartId);

    boolean updateQuantityByCartId(Integer cartId, Integer productQuantity);

}
