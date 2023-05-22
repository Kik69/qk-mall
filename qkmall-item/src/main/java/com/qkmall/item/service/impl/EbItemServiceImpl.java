package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbItemDao;
import com.qkmall.item.pojo.model.EbItemEntity;
import com.qkmall.item.service.EbItemService;


@Service("ebItemService")
public class EbItemServiceImpl extends ServiceImpl<EbItemDao, EbItemEntity> implements EbItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbItemEntity> page = this.page(
                new Query<EbItemEntity>().getPage(params),
                new QueryWrapper<EbItemEntity>()
        );

        return new PageUtils(page);
    }

}