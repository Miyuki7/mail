package com.miyuki.mall.product.dao;

import com.miyuki.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author miyuki
 * @email yuzh7799@gmail.com
 * @date 2022-05-03 22:15:02
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
