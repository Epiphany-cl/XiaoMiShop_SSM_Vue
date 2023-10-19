package com.cl.controller;

import com.cl.pojo.Product;
import com.cl.service.ProductService;
import com.cl.vo.ResultVO;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
