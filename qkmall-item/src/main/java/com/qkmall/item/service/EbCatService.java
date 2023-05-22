package com.qkmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.item.pojo.model.EbCatEntity;

import java.util.Map;

/**
 * 商品类目。
1. 电商一期只支持两种商品，即手机和号卡。促销活动作为一种规则配置到上述两种商品上。二期会增加
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
public interface EbCatService extends IService<EbCatEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

