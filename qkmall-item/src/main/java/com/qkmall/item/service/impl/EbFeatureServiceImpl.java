package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbFeatureDao;
import com.qkmall.item.pojo.model.EbFeatureEntity;
import com.qkmall.item.service.EbFeatureService;


@Service("ebFeatureService")
public class EbFeatureServiceImpl extends ServiceImpl<EbFeatureDao, EbFeatureEntity> implements EbFeatureService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbFeatureEntity> page = this.page(
                new Query<EbFeatureEntity>().getPage(params),
                new QueryWrapper<EbFeatureEntity>()
        );

        return new PageUtils(page);
    }

}