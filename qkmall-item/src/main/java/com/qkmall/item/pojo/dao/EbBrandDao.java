package com.qkmall.item.pojo.dao;

import com.qkmall.item.pojo.model.EbBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 品牌
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Mapper
public interface EbBrandDao extends BaseMapper<EbBrandEntity> {
}
