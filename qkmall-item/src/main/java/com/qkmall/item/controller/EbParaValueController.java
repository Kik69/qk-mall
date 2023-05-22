package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.item.pojo.model.EbParaValueEntity;
import com.qkmall.item.service.EbParaValueService;
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
@RequestMapping("item/ebparavalue")
public class EbParaValueController {
    @Autowired
    private EbParaValueService ebParaValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebParaValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{paraId}")
    public R info(@PathVariable("paraId") Integer paraId){
		EbParaValueEntity ebParaValue = ebParaValueService.getById(paraId);

        return R.ok().put("ebParaValue", ebParaValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbParaValueEntity ebParaValue){
		ebParaValueService.save(ebParaValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbParaValueEntity ebParaValue){
		ebParaValueService.updateById(ebParaValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] paraIds){
		ebParaValueService.removeByIds(Arrays.asList(paraIds));

        return R.ok();
    }

}
