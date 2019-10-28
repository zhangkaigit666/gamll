package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author zhangkai
 * @email zhk@atguigu.com
 * @date 2019-10-28 22:34:33
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
