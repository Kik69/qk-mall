package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.item.pojo.model.EbItemEntity;
import com.qkmall.item.service.EbItemService;
import com.qkmall.common.utils.PageUtils;
import com.qkmall.common.utils.R;



/**
 * 商品，包含手机和号卡，通过在类目表中预置的手机类目和号卡类目来区分。裸机：手机机体，不包含任何通信服务和绑定的费用的机器
 *
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@RestController
@RequestMapping("item/ebitem")
public class EbItemController {
    @Autowired
    private EbItemService ebItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebItemService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{itemId}")
    public R info(@PathVariable("itemId") Integer itemId){
		EbItemEntity ebItem = ebItemService.getById(itemId);

        return R.ok().put("ebItem", ebItem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbItemEntity ebItem){
		ebItemService.save(ebItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbItemEntity ebItem){
		ebItemService.updateById(ebItem);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] itemIds){
		ebItemService.removeByIds(Arrays.asList(itemIds));

        return R.ok();
    }

}
