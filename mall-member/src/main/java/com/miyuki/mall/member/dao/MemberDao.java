package com.miyuki.mall.member.dao;

import com.miyuki.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-04 11:28:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
