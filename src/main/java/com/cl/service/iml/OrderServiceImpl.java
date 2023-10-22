package com.cl.service.iml;

import com.cl.mapper.*;
import com.cl.pojo.Order;
import com.cl.pojo.OrderExample;
import com.cl.pojo.Product;
import com.cl.service.OrderService;
import com.cl.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ShoppingCartMapper  shoppingCartMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductConfigMapper productConfigMapper;

    @Autowired
    private ProductColorMapper productColorMapper;

    @Override
    public boolean createOneOrder(Integer userId,
                                  Integer productId,
                                  Integer productConfigId,
                                  Integer productColorId) {
        Order order = new Order();

        order.setOrderId(generateOrderNo());

        order.setUserId(userId);

        order.setProductId(productId);

        order.setProductConfigId(productConfigId);

        order.setProductColorId(productColorId);

        BigDecimal productPrice = productConfigMapper.selectByPrimaryKey(productConfigId).getProductPrice();
        order.setTotalPrice(productPrice);

        order.setOrderCreateTime(new Date());

        order.setOrderStatus("未支付");

        int i = orderMapper.insertSelective(order);
        return i > 0;
    }

    @Override
    public List<OrderVO> getOrderListByyUserId(Integer userId) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();

        if (userId  != 0) {
            criteria.andUserIdEqualTo(userId);
        }
        orderExample.setOrderByClause("order_create_time desc");

        List<Order> orders = orderMapper.selectByExample(orderExample);

        //orders -> orderVOs
        List<OrderVO> orderVOS = new ArrayList<>();
        orders.forEach(order -> {
            OrderVO orderVO = new OrderVO();

            orderVO.setOrder(order);

            Product product = productMapper.selectByPrimaryKey(order.getProductId());
            orderVO.setProductImgPath(product.getProductImgPath());

            orderVO.setOrderId(order.getOrderId());

            orderVO.setOrderStatus(order.getOrderStatus());

            orderVO.setTotalPrice(order.getTotalPrice());

            orderVO.setCreateTime(order.getOrderCreateTime());

            orderVOS.add(orderVO);

        });

        return orderVOS;
    }

    @Override
    public boolean shoppingCartBilling(Integer userId) {
        //先获根据id获取购物车列表



        return false;
    }

    //订单号生成
    private static String generateOrderNo() {
        // 获取当前日期和时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String dateStr = sdf.format(new Date());

        // 生成一个随机的4位数
        Random random = new Random();
        int randomNum = random.nextInt(10000);

        // 将日期、时间和随机数组合起来形成订单号
        return dateStr + String.format("%04d", randomNum);
    }
}
