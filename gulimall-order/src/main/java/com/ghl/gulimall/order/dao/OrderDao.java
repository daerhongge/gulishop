package com.ghl.gulimall.order.dao;

import com.ghl.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ghl
 * @email 1294719673@qq.com
 * @date 2020-06-05 15:27:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
