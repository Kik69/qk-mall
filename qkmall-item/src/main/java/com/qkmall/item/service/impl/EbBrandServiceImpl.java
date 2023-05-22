package com.qkmall.item.service.impl;

import com.github.pagehelper.PageHelper;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;
import com.qkmall.item.pojo.dao.EbBrandDao;
import com.qkmall.item.service.EbBrandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.qkmall.item.pojo.model.EbBrandEntity;


@Service("ebBrandService")
public class EbBrandServiceImpl extends ServiceImpl<EbBrandDao, EbBrandEntity> implements EbBrandService {

    @Autowired
    EbBrandDao ebBrandDao;
    
    
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EbBrandEntity> page = this.page(
                new Query<EbBrandEntity>().getPage(params),
                new QueryWrapper<EbBrandEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<EbBrandEntity> getListBrandService(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        QueryWrapper<EbBrandEntity> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("brand_id");
        if (StringUtils.isNotEmpty(keyword)){
            wrapper.and(cond -> cond.like("brand_name","%" + keyword + "%"));
        }
        return ebBrandDao.selectList(wrapper);
    }

}