package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import com.qkmall.item.pojo.model.EbCatbrandEntity;
import com.qkmall.item.service.EbCatbrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.R;



/**
 * 
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@RestController
@RequestMapping("item/ebcatbrand")
public class EbCatbrandController {
    @Autowired
    private EbCatbrandService ebCatbrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebCatbrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Integer catId){
		EbCatbrandEntity ebCatbrand = ebCatbrandService.getById(catId);

        return R.ok().put("ebCatbrand", ebCatbrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbCatbrandEntity ebCatbrand){
		ebCatbrandService.save(ebCatbrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbCatbrandEntity ebCatbrand){
		ebCatbrandService.updateById(ebCatbrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] catIds){
		ebCatbrandService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
