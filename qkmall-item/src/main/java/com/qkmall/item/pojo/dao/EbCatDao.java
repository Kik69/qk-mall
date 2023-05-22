package com.qkmall.item.pojo.dao;

import com.qkmall.item.pojo.model.EbCatEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品类目。
1. 电商一期只支持两种商品，即手机和号卡。促销活动作为一种规则配置到上述两种商品上。二期会增加
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Mapper
public interface EbCatDao extends BaseMapper<EbCatEntity> {
	
}
