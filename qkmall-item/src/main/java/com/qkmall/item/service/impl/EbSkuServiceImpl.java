package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbSkuDao;
import com.qkmall.item.pojo.model.EbSkuEntity;
import com.qkmall.item.service.EbSkuService;


@Service("ebSkuService")
public class EbSkuServiceImpl extends ServiceImpl<EbSkuDao, EbSkuEntity> implements EbSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbSkuEntity> page = this.page(
                new Query<EbSkuEntity>().getPage(params),
                new QueryWrapper<EbSkuEntity>()
        );

        return new PageUtils(page);
    }

}