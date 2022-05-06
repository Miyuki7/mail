package com.miyuki.mall.coupon.dao;

import com.miyuki.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:17:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
