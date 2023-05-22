package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbFeatureGroupDao;
import com.qkmall.item.pojo.model.EbFeatureGroupEntity;
import com.qkmall.item.service.EbFeatureGroupService;


@Service("ebFeatureGroupService")
public class EbFeatureGroupServiceImpl extends ServiceImpl<EbFeatureGroupDao, EbFeatureGroupEntity> implements EbFeatureGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbFeatureGroupEntity> page = this.page(
                new Query<EbFeatureGroupEntity>().getPage(params),
                new QueryWrapper<EbFeatureGroupEntity>()
        );

        return new PageUtils(page);
    }

}