package com.cl.service.iml;

import com.cl.mapper.*;
import com.cl.pojo.*;
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

    @Autowired
    private ProductCategoryMapper  productCategoryMapper;

    @Autowired
    private ProductConfigMapper productConfigMapper;

    @Autowired
    private ProductColorMapper productColorMapper;

    @Override
    public PageInfo<Product> list(int categoryId, int pageNum) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();

        if (categoryId != 0) {
            criteria.andProductCategoryIdEqualTo(categoryId);
        }

        return PageHelper.startPage(1, 10 * pageNum).doSelectPageInfo(() -> productMapper.selectByExample(productExample));
    }

    @Override
    public Product getProductById(int productId) {
        return productMapper.selectByPrimaryKey(productId);
    }

    @Override
    public List<ProductConfig> getProductConfig(int productId) {
        ProductConfigExample productConfigExample = new ProductConfigExample();
        ProductConfigExample.Criteria criteria = productConfigExample.createCriteria();
        if (productId != 0) {
            criteria.andProductIdEqualTo(productId);
        }
        return productConfigMapper.selectByExample(productConfigExample);
    }

    @Override
    public List<ProductColor> getProductColor(int productId) {
        ProductColorExample productColorExample = new ProductColorExample();
        ProductColorExample.Criteria criteria = productColorExample.createCriteria();
        if (productId != 0) {
            criteria.andProductIdEqualTo(productId);
        }
        return productColorMapper.selectByExample(productColorExample);
    }

    @Override
    public String getCategoryNameByid(int categoryId) {
        return productCategoryMapper.selectByPrimaryKey(categoryId).getCategoryName();
    }
}
