package com.xcdval.gulimall.product.dao;

import com.xcdval.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-29 22:32:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
