package com.cl.mapper;

import com.cl.pojo.ProductColor;
import com.cl.pojo.ProductColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductColorMapper {
    int countByExample(ProductColorExample example);

    int deleteByExample(ProductColorExample example);

    int deleteByPrimaryKey(Integer productColorId);

    int insert(ProductColor record);

    int insertSelective(ProductColor record);

    List<ProductColor> selectByExample(ProductColorExample example);

    ProductColor selectByPrimaryKey(Integer productColorId);

    int updateByExampleSelective(@Param("record") ProductColor record, @Param("example") ProductColorExample example);

    int updateByExample(@Param("record") ProductColor record, @Param("example") ProductColorExample example);

    int updateByPrimaryKeySelective(ProductColor record);

    int updateByPrimaryKey(ProductColor record);
}