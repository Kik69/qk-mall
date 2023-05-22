package com.qkmall.item.pojo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 最小销售单元，包括实体商品、虚拟商品（如号卡、套卡、话费等）
将要增加的字段：
STOCK_IN
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Data
@TableName("eb_sku")
public class EbSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 最小销售单元主键
	 */
	@TableId
	private Integer skuId;
	/**
	 * 
	 */
	private Integer itemId;
	/**
	 * 货号
	 */
	private String sku;
	/**
	 * (以分币为单位)售价、号卡预存话费：所有价格相关的字段限定为9位有效数字以内（即1234567.89，相当于千万元以内），给前端用户显示时，小数永远保持2位，即整数价格后面显示为.00；
            若小数价格多于2位小数，则直接截掉2位小数右边的小数（不用四舍五入）；若小数为1位，如1元9角，则显示1.90
	 */
	private BigDecimal skuPrice;
	/**
	 * 上下架状态：0.为上架；1.为下架
	 */
	private BigDecimal showStatus;
	/**
	 * 库存
	 */
	private BigDecimal stockInventory;
	/**
	 * 购买上限
	 */
	private BigDecimal skuUpperLimit;
	/**
	 * 货位：可以输入特殊字符，需转义
	 */
	private String location;
	/**
	 * 图片存储位置，1~5
	 */
	private String skuImg;
	/**
	 * 前台显示排序
	 */
	private BigDecimal skuSort;
	/**
	 * SKU名称
	 */
	private String skuName;
	/**
	 * (以分币为单位)市场价：所有价格相关的字段限定为9位有效数字以内（即1234567.89，相当于千万元以内），给前端用户显示时，小数永远保持2位，即整数价格后面显示为.00；若小数价格多于2位小数，则直接截掉2位小数右边的小数（不用四舍五入）；若小数为1位，如1元9角，则显示1.90
	 */
	private BigDecimal marketPrice;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Integer createUserId;
	/**
	 * 
	 */
	private Integer updateUserId;
	/**
	 * 
	 */
	private Integer originalSkuId;
	/**
	 * 0是历史记录;1最新
	 */
	private BigDecimal lastStatus;
	/**
	 * 
	 */
	private Integer merchantId;
	/**
	 * 0为赠品；1为普通SKU
	 */
	private BigDecimal skuType;
	/**
	 * 
	 */
	private BigDecimal sales;
	/**
	 * crm返回参数，给crm开通的终端类别
	 */
	private String resCode;
	/**
	 * crm导入，资源包id
	 */
	private BigDecimal packId;

}
