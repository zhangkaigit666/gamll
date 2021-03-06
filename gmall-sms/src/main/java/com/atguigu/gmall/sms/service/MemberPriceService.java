package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.MemberPriceEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品会员价格
 *
 * @author zhangkai
 * @email zhk@atguigu.com
 * @date 2019-10-28 22:29:15
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageVo queryPage(QueryCondition params);
}

