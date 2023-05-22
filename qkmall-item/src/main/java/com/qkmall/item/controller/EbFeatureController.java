package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.item.pojo.model.EbFeatureEntity;
import com.qkmall.item.service.EbFeatureService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.R;



/**
 * 商品属性
预置的手机参数（请将预置可选值补充完整）
1.      型号            
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@RestController
@RequestMapping("item/ebfeature")
public class EbFeatureController {
    @Autowired
    private EbFeatureService ebFeatureService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebFeatureService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{featureId}")
    public R info(@PathVariable("featureId") Integer featureId){
		EbFeatureEntity ebFeature = ebFeatureService.getById(featureId);

        return R.ok().put("ebFeature", ebFeature);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbFeatureEntity ebFeature){
		ebFeatureService.save(ebFeature);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbFeatureEntity ebFeature){
		ebFeatureService.updateById(ebFeature);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] featureIds){
		ebFeatureService.removeByIds(Arrays.asList(featureIds));

        return R.ok();
    }

}
