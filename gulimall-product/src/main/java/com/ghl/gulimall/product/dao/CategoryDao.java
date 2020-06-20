package com.ghl.gulimall.product.dao;

import com.ghl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ghl
 * @email 1294719673@qq.com
 * @date 2020-06-05 13:36:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
