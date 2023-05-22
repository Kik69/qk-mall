package com.qkmall.item.pojo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;

import lombok.Data;

/**
 * 商品属性
预置的手机参数（请将预置可选值补充完整）
1.      型号            
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Data
@TableName("eb_feature")
public class EbFeatureEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品属性主键
	 */
	@TableId
	private Integer featureId;
	/**
	 * 
	 */
	private Integer catId;
	/**
	 * 属性名称
	 */
	private String featureName;
	/**
	 * 是否为规格：0.为否 1.为是
	 */
	private BigDecimal isSpec;
	/**
	 * 是否为筛选：0为否 1为是
	 */
	private BigDecimal isSelect;
	/**
	 * 是否前台显示：0.为否 1.为是
	 */
	private BigDecimal isShow;
	/**
	 * 属性可选值：用英文逗号分割的可选值，可选值里不许有逗号
	 */
	private String selectValues;
	/**
	 * 录入方式：1.树状菜单，2.单选，3.复选，4.文本框
	 */
	private BigDecimal inputType;
	/**
	 * 前台显示排序
	 */
	private BigDecimal featureSort;

}
