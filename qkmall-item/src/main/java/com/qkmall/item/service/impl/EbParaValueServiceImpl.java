package com.qkmall.item.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;

import com.qkmall.item.pojo.dao.EbParaValueDao;
import com.qkmall.item.pojo.model.EbParaValueEntity;
import com.qkmall.item.service.EbParaValueService;


@Service("ebParaValueService")
public class EbParaValueServiceImpl extends ServiceImpl<EbParaValueDao, EbParaValueEntity> implements EbParaValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbParaValueEntity> page = this.page(
                new Query<EbParaValueEntity>().getPage(params),
                new QueryWrapper<EbParaValueEntity>()
        );

        return new PageUtils(page);
    }

}