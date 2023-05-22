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
@TableName("eb_item_clob")
public class EbItemClobEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer itemId;
	/**
	 * 商品描述：富文本编辑器；可以输入特殊字符，需转义；无字符限制
	 */
	private String itemDesc;
	/**
	 * 包装清单
	 */
	private String packingList;

}
