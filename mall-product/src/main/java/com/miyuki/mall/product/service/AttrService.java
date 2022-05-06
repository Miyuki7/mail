package com.miyuki.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miyuki.common.utils.PageUtils;
import com.miyuki.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-03 22:15:02
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

