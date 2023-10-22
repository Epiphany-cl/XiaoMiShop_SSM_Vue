package com.cl.service;

import com.cl.vo.OrderVO;

import java.util.List;

public interface OrderService {
    boolean createOneOrder(Integer userId, Integer productId, Integer productConfigId, Integer productColorId);

    List<OrderVO> getOrderListByyUserId(Integer userId);

    boolean shoppingCartBilling(Integer userId);
}
