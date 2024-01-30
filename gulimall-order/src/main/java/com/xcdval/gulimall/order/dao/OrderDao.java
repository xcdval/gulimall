package com.xcdval.gulimall.order.dao;

import com.xcdval.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xcdval
 * @email veenxx@outlook.com
 * @date 2024-01-30 09:43:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
