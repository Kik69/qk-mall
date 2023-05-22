package com.qkmall.item.pojo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 规格值（与价格有关）
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Data
@TableName("eb_spec_value")
public class EbSpecValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 规格值主键
	 */
	@TableId
	private Integer specId;
	/**
	 * 
	 */
	private Integer skuId;
	/**
	 * 
	 */
	private Integer featureId;
	/**
	 * 规格值
	 */
	private String specValue;

}
