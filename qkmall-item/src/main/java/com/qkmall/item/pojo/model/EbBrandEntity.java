package com.qkmall.item.pojo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;

import lombok.Data;

/**
 * 品牌
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Data
@TableName("eb_brand")
public class EbBrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌主键
	 */
	@TableId
	private Integer brandId;
	/**
	 * 品牌名称：一般为该字段在前台显示的中文名称，也可含有英文或数字
	 */
	private String brandName;
	/**
	 * 品牌描述
	 */
	private String brandDesc;
	/**
	 * 品牌图标：存储图标地址
	 */
	private String imgs;
	/**
	 * 品牌网址
	 */
	private String website;
	/**
	 * 前台显示排序
	 */
	private BigDecimal brandSort;

}
