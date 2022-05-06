package com.miyuki.mall.order.dao;

import com.miyuki.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:40:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
