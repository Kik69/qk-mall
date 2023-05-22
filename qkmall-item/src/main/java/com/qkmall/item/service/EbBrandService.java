package com.qkmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkmall.common.pager.CommonPage;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.item.pojo.model.EbBrandEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
public interface EbBrandService extends IService<EbBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    List<EbBrandEntity> getListBrandService(String keyword, int pageNum, int pageSize);
}

