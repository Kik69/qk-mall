package com.qkmall.item.pojo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Data
@TableName("eb_feature_group")
public class EbFeatureGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品属性组主键
	 */
	@TableId
	private Integer groupId;
	/**
	 * 
	 */
	private Integer catId;
	/**
	 * 
	 */
	private String groupName;
	/**
	 * 
	 */
	private String groupDesc;
	/**
	 * 
	 */
	private Integer groupSort;

}
