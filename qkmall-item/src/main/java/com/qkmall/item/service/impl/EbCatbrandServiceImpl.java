package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbCatbrandDao;
import com.qkmall.item.pojo.model.EbCatbrandEntity;
import com.qkmall.item.service.EbCatbrandService;


@Service("ebCatbrandService")
public class EbCatbrandServiceImpl extends ServiceImpl<EbCatbrandDao, EbCatbrandEntity> implements EbCatbrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbCatbrandEntity> page = this.page(
                new Query<EbCatbrandEntity>().getPage(params),
                new QueryWrapper<EbCatbrandEntity>()
        );

        return new PageUtils(page);
    }

}