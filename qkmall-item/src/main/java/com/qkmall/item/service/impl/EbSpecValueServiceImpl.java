package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbSpecValueDao;
import com.qkmall.item.pojo.model.EbSpecValueEntity;
import com.qkmall.item.service.EbSpecValueService;


@Service("ebSpecValueService")
public class EbSpecValueServiceImpl extends ServiceImpl<EbSpecValueDao, EbSpecValueEntity> implements EbSpecValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbSpecValueEntity> page = this.page(
                new Query<EbSpecValueEntity>().getPage(params),
                new QueryWrapper<EbSpecValueEntity>()
        );

        return new PageUtils(page);
    }

}