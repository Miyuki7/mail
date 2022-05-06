package com.miyuki.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miyuki.common.utils.PageUtils;
import com.miyuki.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:28:54
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

