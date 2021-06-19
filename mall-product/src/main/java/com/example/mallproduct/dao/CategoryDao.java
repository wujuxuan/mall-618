package com.example.mallproduct.dao;

import com.example.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 13:06:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
