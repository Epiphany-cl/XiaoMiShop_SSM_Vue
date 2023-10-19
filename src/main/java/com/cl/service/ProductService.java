package com.cl.service;

import com.cl.pojo.Product;
import com.cl.vo.ResultVO;
import com.github.pagehelper.PageInfo;

public interface ProductService {
    PageInfo<Product> list(int categoryId, int pageNum);
}
