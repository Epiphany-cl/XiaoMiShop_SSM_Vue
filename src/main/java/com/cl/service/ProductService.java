package com.cl.service;

import com.cl.pojo.Product;
import com.cl.pojo.ProductColor;
import com.cl.pojo.ProductConfig;
import com.cl.vo.ResultVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductService {
    PageInfo<Product> list(int categoryId, int pageNum);

    Product getProductById(int productId);

    List<ProductConfig> getProductConfig(int productId);

    List<ProductColor> getProductColor(int productId);

    String getCategoryNameByid(int categoryId);

    PageInfo<Product> getPageInfo(int pageNum, int pageSize);

    boolean updateProduct(Product product);
}
