package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import com.qkmall.item.pojo.model.EbCatEntity;
import com.qkmall.item.service.EbCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.R;



/**
 * 商品类目。
1. 电商一期只支持两种商品，即手机和号卡。促销活动作为一种规则配置到上述两种商品上。二期会增加
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@RestController
@RequestMapping("item/ebcat")
public class EbCatController {
    @Autowired
    private EbCatService ebCatService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebCatService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Integer catId){
		EbCatEntity ebCat = ebCatService.getById(catId);

        return R.ok().put("ebCat", ebCat);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    
    public R save(@RequestBody EbCatEntity ebCat){
		ebCatService.save(ebCat);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbCatEntity ebCat){
		ebCatService.updateById(ebCat);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] catIds){
		ebCatService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
