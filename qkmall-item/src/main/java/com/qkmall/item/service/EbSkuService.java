package com.qkmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.item.pojo.model.EbSkuEntity;

import java.util.Map;

/**
 * 最小销售单元，包括实体商品、虚拟商品（如号卡、套卡、话费等）
将要增加的字段：
STOCK_IN
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
public interface EbSkuService extends IService<EbSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

