package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangkai
 * @email zhk@atguigu.com
 * @date 2019-10-28 22:27:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
