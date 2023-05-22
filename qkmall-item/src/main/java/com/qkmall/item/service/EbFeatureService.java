package com.qkmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.item.pojo.model.EbFeatureEntity;

import java.util.Map;

/**
 * 商品属性
预置的手机参数（请将预置可选值补充完整）
1.      型号            
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
public interface EbFeatureService extends IService<EbFeatureEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

