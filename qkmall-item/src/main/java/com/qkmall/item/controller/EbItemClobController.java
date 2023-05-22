package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.item.pojo.model.EbItemClobEntity;
import com.qkmall.item.service.EbItemClobService;
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
@RequestMapping("item/ebitemclob")
public class EbItemClobController {
    @Autowired
    private EbItemClobService ebItemClobService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebItemClobService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{itemId}")
    public R info(@PathVariable("itemId") Integer itemId){
		EbItemClobEntity ebItemClob = ebItemClobService.getById(itemId);

        return R.ok().put("ebItemClob", ebItemClob);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbItemClobEntity ebItemClob){
		ebItemClobService.save(ebItemClob);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbItemClobEntity ebItemClob){
		ebItemClobService.updateById(ebItemClob);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] itemIds){
		ebItemClobService.removeByIds(Arrays.asList(itemIds));

        return R.ok();
    }

}
