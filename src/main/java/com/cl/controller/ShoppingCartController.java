package com.cl.controller;

import com.cl.pojo.ShoppingCart;
import com.cl.pojo.User;
import com.cl.service.ShoppingCartService;
import com.cl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequestMapping("/shoppingCart")
@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping("/addShoppingCartByProductId")
    public ResultVO<Object> addShoppingCartByProductId(HttpSession session,
                                                       Integer productId,
                                                       Integer productConfigId,
                                                       Integer productColorId) {
        ShoppingCart shoppingCart = new ShoppingCart();

        User user = (User) session.getAttribute("user");
        Integer userId = user.getUserId();

        shoppingCart.setProductId(productId);
        shoppingCart.setUserId(userId);
        shoppingCart.setCartStauts(1);
        shoppingCart.setProductQuantity(1);
        shoppingCart.setProductConfigId(productConfigId);
        shoppingCart.setProductColorId(productColorId);

        boolean b = shoppingCartService.addShoppingCart(shoppingCart);

        if (!b) {
            return new ResultVO<>(444, "添加购物车失败");
        } else {
            return new ResultVO<>();
        }
    }
}
