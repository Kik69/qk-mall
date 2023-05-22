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
@TableName("eb_para_value")
public class EbParaValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 参数值主键
	 */
	@TableId
	private Integer paraId;
	/**
	 * 
	 */
	private Integer itemId;
	/**
	 * 
	 */
	private Integer featureId;
	/**
	 * 参数值
	 */
	private String paraValue;

}
