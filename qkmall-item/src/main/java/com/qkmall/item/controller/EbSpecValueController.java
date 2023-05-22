package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import com.qkmall.item.pojo.model.EbSpecValueEntity;
import com.qkmall.item.service.EbSpecValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.R;



/**
 * 规格值（与价格有关）
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@RestController
@RequestMapping("item/ebspecvalue")
public class EbSpecValueController {
    @Autowired
    private EbSpecValueService ebSpecValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebSpecValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{specId}")
    public R info(@PathVariable("specId") Integer specId){
		EbSpecValueEntity ebSpecValue = ebSpecValueService.getById(specId);

        return R.ok().put("ebSpecValue", ebSpecValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbSpecValueEntity ebSpecValue){
		ebSpecValueService.save(ebSpecValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbSpecValueEntity ebSpecValue){
		ebSpecValueService.updateById(ebSpecValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] specIds){
		ebSpecValueService.removeByIds(Arrays.asList(specIds));

        return R.ok();
    }

}
