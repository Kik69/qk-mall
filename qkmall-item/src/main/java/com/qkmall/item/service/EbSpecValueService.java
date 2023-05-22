package com.qkmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.item.pojo.model.EbSpecValueEntity;

import java.util.Map;

/**
 * 规格值（与价格有关）
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
public interface EbSpecValueService extends IService<EbSpecValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

