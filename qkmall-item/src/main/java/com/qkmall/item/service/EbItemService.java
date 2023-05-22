package com.qkmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.item.pojo.model.EbItemEntity;

import java.util.Map;

/**
 * 商品，包含手机和号卡，通过在类目表中预置的手机类目和号卡类目来区分。裸机：手机机体，不包含任何通信服务和绑定的费用的机器
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
public interface EbItemService extends IService<EbItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

