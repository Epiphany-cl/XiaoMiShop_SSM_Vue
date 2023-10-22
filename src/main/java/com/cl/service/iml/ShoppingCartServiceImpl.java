package com.cl.service.iml;

import com.cl.mapper.ProductColorMapper;
import com.cl.mapper.ProductConfigMapper;
import com.cl.mapper.ProductMapper;
import com.cl.mapper.ShoppingCartMapper;
import com.cl.pojo.*;
import com.cl.service.ShoppingCartService;
import com.cl.vo.ShoppingCartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductConfigMapper productConfigMapper;

    @Autowired
    private ProductColorMapper productColorMapper;


    @Override
    public boolean addShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartMapper.insertSelective(shoppingCart) > 0;
    }

    @Override
    public List<ShoppingCartVO> getShoppingCartByUserId(Integer userId) {
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        if (userId != null && userId != 0) {
            shoppingCartExample.createCriteria().andUserIdEqualTo(userId);
        }
        shoppingCartExample.setOrderByClause("cart_id desc");
        List<ShoppingCart> shoppingCartList = shoppingCartMapper.selectByExample(shoppingCartExample);

        List<ShoppingCartVO> shoppingCartVOS = new ArrayList<>();
        // shoppingCart => shoppingCartVO
        if (shoppingCartList != null && !shoppingCartList.isEmpty()) {

            shoppingCartList.forEach(shoppingCart -> {
                Product product = productMapper.selectByPrimaryKey(shoppingCart.getProductId());
                ProductConfig productConfig = productConfigMapper.selectByPrimaryKey(shoppingCart.getProductConfigId());
                ProductColor productColor = productColorMapper.selectByPrimaryKey(shoppingCart.getProductColorId());

                ShoppingCartVO shoppingCartVO = new ShoppingCartVO();

                shoppingCartVO.setShoppingCart(shoppingCart);

                shoppingCartVO.setCartId(shoppingCart.getCartId());

                shoppingCartVO.setCartStatus(shoppingCart.getCartStatus());

                shoppingCartVO.setProductImg(product.getProductImgPath());

                //小米6 | 6GB+64GB | 亮黑色
                String productName = product.getProductName() + " | " + productConfig.getProductConfig() + " | " + productColor.getProductColor();
                shoppingCartVO.setProductName(productName);

                shoppingCartVO.setProductPrice(productConfig.getProductPrice());

                shoppingCartVO.setProductQuantity(shoppingCart.getProductQuantity());

                shoppingCartVOS.add(shoppingCartVO);
            });
        }

        return shoppingCartVOS;
    }

    @Override
    public boolean changeProductStatusByCartId(Integer cartId) {
        ShoppingCart shoppingCart = shoppingCartMapper.selectByPrimaryKey(cartId);
        Integer cartStatus = shoppingCart.getCartStatus();

        if (cartStatus == 0) {
            cartStatus = 1;
        } else {
            cartStatus = 0;
        }

        shoppingCart.setCartStatus(cartStatus);

        int i = shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart);

        return i > 0;
    }

    @Override
    public boolean changeAllStatusByUserId(Boolean selectAllStatus, Integer userId) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartStatus(selectAllStatus ? 1 : 0);

        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        shoppingCartExample.createCriteria().andUserIdEqualTo(userId);

        int i = shoppingCartMapper.updateByExampleSelective(shoppingCart, shoppingCartExample);

        return i > 0;
    }

    @Override
    public boolean deleteShoppingCartByCartId(Integer cartId) {
        int i = shoppingCartMapper.deleteByPrimaryKey(cartId);
        return i > 0;
    }

    @Override
    public boolean updateQuantityByCartId(Integer cartId, Integer productQuantity) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setProductQuantity(productQuantity);
        shoppingCart.setCartId(cartId);

        int i = shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart);
        return i > 0;
    }



}
