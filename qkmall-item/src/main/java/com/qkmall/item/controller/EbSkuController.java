package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import com.qkmall.item.pojo.model.EbSkuEntity;
import com.qkmall.item.service.EbSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.R;



/**
 * 最小销售单元，包括实体商品、虚拟商品（如号卡、套卡、话费等）
将要增加的字段：
STOCK_IN
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@RestController
@RequestMapping("item/ebsku")
public class EbSkuController {
    @Autowired
    private EbSkuService ebSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{skuId}")
    public R info(@PathVariable("skuId") Integer skuId){
		EbSkuEntity ebSku = ebSkuService.getById(skuId);

        return R.ok().put("ebSku", ebSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbSkuEntity ebSku){
		ebSkuService.save(ebSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbSkuEntity ebSku){
		ebSkuService.updateById(ebSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] skuIds){
		ebSkuService.removeByIds(Arrays.asList(skuIds));

        return R.ok();
    }

}
