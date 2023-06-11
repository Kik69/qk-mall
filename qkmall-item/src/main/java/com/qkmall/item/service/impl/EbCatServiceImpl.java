package com.qkmall.item.service.impl;

import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @Override
    public List<EbCatEntity> listCatTree() {
        List<EbCatEntity> cats = baseMapper.selectList(null);
        return cats.stream()
                .filter(cat -> cat.getParentId().intValue() == 0)
                .map(cat -> {
                    cat.setChildren(this.getChildren(cat,cats));
                    return cat;
                })
                .sorted(Comparator.comparingInt(menu -> (menu.getCatSort() == null ? 0 : menu.getCatSort().intValue())))
                .collect(Collectors.toList());
    }
    
    public List<EbCatEntity> getChildren(EbCatEntity pCat,List<EbCatEntity> allCats){
        return allCats.stream()
                .filter(cat-> pCat.getCatId().equals(cat.getParentId()))
                .map(cat->{
                    cat.setChildren(this.getChildren(cat,allCats));
                    return cat;
                })
                .collect(Collectors.toList());
    }

}