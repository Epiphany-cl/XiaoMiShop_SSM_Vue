package com.cl.controller;


import com.cl.pojo.Order;
import com.cl.pojo.User;
import com.cl.service.OrderService;
import com.cl.vo.OrderVO;
import com.cl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //在购物车中添加产品，生成订单
    @RequestMapping("/createOrderOnProduct")
    public ResultVO<Object> createOrderOnProduct(Integer productId,
                                                 Integer productConfigId,
                                                 Integer productColorId,
                                                 HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return new ResultVO<>(400, "请先登录");
        }

        Integer userId = user.getUserId();

        boolean oneOrder = orderService.createOneOrder(userId, productId, productConfigId, productColorId);

        if (!oneOrder) {
            return new ResultVO<>(400, "生成订单失败");
        }

        return new ResultVO<>(200,"订单单生成成功");
    }

    @RequestMapping("/getOrderList")
    public ResultVO<OrderVO> getOrderList(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return new ResultVO<>(400, "请先登录");
        }

        Integer userId = user.getUserId();

        List<OrderVO> orderVOList = orderService.getOrderListByyUserId(userId);

        return new ResultVO<>(orderVOList);
    }

    //购物车结算
    @RequestMapping("/shoppingCartBilling")
    public ResultVO<Object> shoppingCartBilling(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return new ResultVO<>(444, "请先登录");
        }

        Integer userId = user.getUserId();

        System.out.println("userId = " + userId);

        boolean b = orderService.shoppingCartBilling(userId);

        return new ResultVO<>();
    }


}
