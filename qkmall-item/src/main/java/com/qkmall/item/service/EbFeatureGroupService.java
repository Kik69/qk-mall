package com.qkmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.item.pojo.model.EbFeatureGroupEntity;

import java.util.Map;

/**
 * 
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
public interface EbFeatureGroupService extends IService<EbFeatureGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

