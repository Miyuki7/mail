package com.miyuki.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miyuki.common.utils.PageUtils;
import com.miyuki.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:40:14
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

