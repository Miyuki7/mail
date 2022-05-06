package com.miyuki.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miyuki.common.utils.PageUtils;
import com.miyuki.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:40:14
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

