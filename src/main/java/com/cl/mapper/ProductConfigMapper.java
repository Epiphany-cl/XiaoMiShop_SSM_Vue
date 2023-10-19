package com.cl.mapper;

import com.cl.pojo.ProductConfig;
import com.cl.pojo.ProductConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductConfigMapper {
    int countByExample(ProductConfigExample example);

    int deleteByExample(ProductConfigExample example);

    int deleteByPrimaryKey(Integer productConfigId);

    int insert(ProductConfig record);

    int insertSelective(ProductConfig record);

    List<ProductConfig> selectByExample(ProductConfigExample example);

    ProductConfig selectByPrimaryKey(Integer productConfigId);

    int updateByExampleSelective(@Param("record") ProductConfig record, @Param("example") ProductConfigExample example);

    int updateByExample(@Param("record") ProductConfig record, @Param("example") ProductConfigExample example);

    int updateByPrimaryKeySelective(ProductConfig record);

    int updateByPrimaryKey(ProductConfig record);
}