package com.cl.service.iml;

import com.cl.mapper.ProductMapper;
import com.cl.pojo.Product;
import com.cl.pojo.ProductExample;
import com.cl.service.ProductService;
import com.cl.vo.ResultVO;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product> list(int categoryId, int pageNum) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();

        if (categoryId != 0) {
            criteria.andProductCategoryIdEqualTo(categoryId);
        }

        return PageHelper.startPage(1, 10 * pageNum).doSelectPageInfo(() -> productMapper.selectByExample(productExample));
    }
}
