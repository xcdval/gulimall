package com.xcdval.gulimall.order.dao;

import com.xcdval.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-30 09:43:14
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
