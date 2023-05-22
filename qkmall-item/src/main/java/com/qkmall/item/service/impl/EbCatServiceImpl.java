package com.qkmall.item.service.impl;

import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.item.pojo.dao.EbCatDao;
import com.qkmall.item.pojo.model.EbCatEntity;
import com.qkmall.item.service.EbCatService;


@Service("ebCatService")
public class EbCatServiceImpl extends ServiceImpl<EbCatDao, EbCatEntity> implements EbCatService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbCatEntity> page = this.page(
                new Query<EbCatEntity>().getPage(params),
                new QueryWrapper<EbCatEntity>()
        );

        return new PageUtils(page);
    }

}