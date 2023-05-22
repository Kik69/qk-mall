package com.qkmall.item.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qkmall.item.pojo.model.EbFeatureGroupEntity;
import com.qkmall.item.service.EbFeatureGroupService;
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
@RequestMapping("item/ebfeaturegroup")
public class EbFeatureGroupController {
    @Autowired
    private EbFeatureGroupService ebFeatureGroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = ebFeatureGroupService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{groupId}")
    public R info(@PathVariable("groupId") Integer groupId){
		EbFeatureGroupEntity ebFeatureGroup = ebFeatureGroupService.getById(groupId);

        return R.ok().put("ebFeatureGroup", ebFeatureGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EbFeatureGroupEntity ebFeatureGroup){
		ebFeatureGroupService.save(ebFeatureGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EbFeatureGroupEntity ebFeatureGroup){
		ebFeatureGroupService.updateById(ebFeatureGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] groupIds){
		ebFeatureGroupService.removeByIds(Arrays.asList(groupIds));

        return R.ok();
    }

}
