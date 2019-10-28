package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SpuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author zhangkai
 * @email zhk@atguigu.com
 * @date 2019-10-28 22:29:15
 */
@Mapper
public interface SpuLadderDao extends BaseMapper<SpuLadderEntity> {
	
}
