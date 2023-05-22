package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.qkmall.common.CommonResult;
import com.qkmall.common.pager.CommonPage;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.R;
import com.qkmall.item.service.EbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qkmall.item.pojo.model.EbBrandEntity;


/**
 * 品牌
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@RestController
@RequestMapping("item/ebBrand")
public class EbBrandController {
    @Autowired
    private EbBrandService ebBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebBrandService.queryPage(params);
        return R.ok().put("page", page);
    }

    @RequestMapping("/getBrandList")
    public CommonResult<CommonPage<EbBrandEntity>> getBrandList(@RequestParam(value = "keyword", required = false) String keyword,
                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        List<EbBrandEntity> brandService = ebBrandService.getListBrandService(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandService));

    }

    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Integer brandId){
		EbBrandEntity ebBrand = ebBrandService.getById(brandId);

        return R.ok().put("ebBrand", ebBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbBrandEntity ebBrand){
		ebBrandService.save(ebBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbBrandEntity ebBrand){
		ebBrandService.updateById(ebBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] brandIds){
		ebBrandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
