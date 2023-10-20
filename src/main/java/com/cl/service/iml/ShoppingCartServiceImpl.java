package com.cl.service.iml;

import com.cl.mapper.ShoppingCartMapper;
import com.cl.pojo.ShoppingCart;
import com.cl.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public boolean addShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartMapper.insertSelective(shoppingCart) > 0;
    }
}
