package com.miyuki.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miyuki.common.utils.PageUtils;
import com.miyuki.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:17:37
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

