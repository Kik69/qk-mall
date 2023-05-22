package com.qkmall.item.pojo.dao;

import com.qkmall.item.pojo.model.EbSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 最小销售单元，包括实体商品、虚拟商品（如号卡、套卡、话费等）
将要增加的字段：
STOCK_IN
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Mapper
public interface EbSkuDao extends BaseMapper<EbSkuEntity> {
	
}
