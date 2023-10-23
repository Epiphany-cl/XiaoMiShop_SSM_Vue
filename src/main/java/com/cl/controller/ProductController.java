package com.cl.controller;

import com.cl.pojo.Product;
import com.cl.pojo.ProductColor;
import com.cl.pojo.ProductConfig;
import com.cl.service.ProductService;
import com.cl.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public ResultVO<Product> getProductList(int categoryId, int pageNum) {
        // 查询商品列表
        PageInfo<Product> productPageInfo = productService.list(categoryId, pageNum);

        return new ResultVO<>(productPageInfo);
    }

    @RequestMapping("/getProuct")
    public ResultVO<Product> getProduct(int productId) {
        return new ResultVO<>(productService.getProductById(productId));
    }

    @RequestMapping("/getProuctConfig")
    public ResultVO<ProductConfig> getProductConfig(int productId) {
        return new ResultVO<>(productService.getProductConfig(productId));
    }

    @RequestMapping("/getProuctColor")
    public ResultVO<ProductColor> getProductColor(int productId) {
        return new ResultVO<>(productService.getProductColor(productId));
    }

    @RequestMapping("/getCategoryNameById")
    public ResultVO<String> getCategoryNameById(int categoryId) {
        return new ResultVO<>(productService.getCategoryNameByid(categoryId));
    }

    @RequestMapping("/getProductPageInfo")
    public ResultVO<Product> getProductPageInfo(int pageNum,
                                                int pageSize) {

        PageInfo<Product> productPageInfo = productService.getPageInfo(pageNum, pageSize);

        return new ResultVO<>(productPageInfo);
    }

    @RequestMapping("/update")
    public ResultVO<Product> updateProduct(@RequestBody Product product) {
        boolean b = productService.updateProduct(product);

        if (!b) {
            return new ResultVO<>(500, "更新失败");
        }

        System.out.println("product = " + product);
        return new ResultVO<>();
    }
}
