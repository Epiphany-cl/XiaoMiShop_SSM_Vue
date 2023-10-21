package com.cl.controller;

import com.cl.pojo.ShoppingCart;
import com.cl.pojo.User;
import com.cl.service.ShoppingCartService;
import com.cl.vo.ResultVO;
import com.cl.vo.ShoppingCartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/shoppingCart")
@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping("/addShoppingCartByProductId")
    public ResultVO<Object> addShoppingCartByProductId(HttpSession session, Integer productId, Integer productConfigId, Integer productColorId) {
        ShoppingCart shoppingCart = new ShoppingCart();

        User user = (User) session.getAttribute("user");
        Integer userId = user.getUserId();

        shoppingCart.setProductId(productId);
        shoppingCart.setUserId(userId);
        shoppingCart.setCartStatus(1);
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

    @RequestMapping("/getShoppingCart")
    public ResultVO<ShoppingCartVO> getShoppingCartByUserId(HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return new ResultVO<>(444, "请先登录");
        }

        Integer userId = user.getUserId();

        List<ShoppingCartVO> shoppingCartVO = shoppingCartService.getShoppingCartByUserId(userId);

        if (shoppingCartVO != null) {
            return new ResultVO<>(shoppingCartVO);
        }
        return new ResultVO<>(444, "获取购物车失败");
    }

    @RequestMapping("/changeProductStatus")
    public ResultVO<Object> changeProductStatus(Integer cartId) {
        boolean b = shoppingCartService.changeProductStatusByCartId(cartId);
        if (!b) {
            return new ResultVO<>(444, "修改失败");
        } else {
            return new ResultVO<>(200, "修改成功");
        }
    }

    @RequestMapping("/changeAllStatus")
    public ResultVO<Object> changeAllStatus(Boolean selectAllStatus, HttpSession session) {
        //selectAllStatus 勾线为true
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return new ResultVO<>(444, "请先登录");
        }

        Integer userId = user.getUserId();

        boolean b = shoppingCartService.changeAllStatusByUserId(selectAllStatus, userId);

        if (!b) {
            return new ResultVO<>(444, "修改失败");
        }
        return new ResultVO<>(200, "全选/全不选 成功！");
    }


    @RequestMapping("/deleteShoppingCartByCartId")
    public ResultVO<Object> deleteShoppingCartByCartId(Integer cartId) {
        boolean b = shoppingCartService.deleteShoppingCartByCartId(cartId);
        if (!b) {
            return new ResultVO<>(444, "删除失败");
        }
        return new ResultVO<>(200, "删除成功");
    }
}


