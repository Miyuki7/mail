package com.miyuki.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miyuki.common.utils.PageUtils;
import com.miyuki.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:17:37
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

