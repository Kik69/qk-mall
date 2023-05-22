package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbItemClobDao;
import com.qkmall.item.pojo.model.EbItemClobEntity;
import com.qkmall.item.service.EbItemClobService;


@Service("ebItemClobService")
public class EbItemClobServiceImpl extends ServiceImpl<EbItemClobDao, EbItemClobEntity> implements EbItemClobService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbItemClobEntity> page = this.page(
                new Query<EbItemClobEntity>().getPage(params),
                new QueryWrapper<EbItemClobEntity>()
        );

        return new PageUtils(page);
    }

}