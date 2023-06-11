package com.qkmall.item.pojo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 商品类目。
1. 电商一期只支持两种商品，即手机和号卡。促销活动作为一种规则配置到上述两种商品上。二期会增加
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Data
@TableName("eb_cat")
public class EbCatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 类目主键。商品本身并不记录自己所属的商品种类（即：是属于手机还是号卡），而是通过其所属的类目来确定。就是说，系统的类目会初始化两种顶级类目：一种是手机（CAT_ID号是1），另一种是号卡（CAT_ID号是2）。系统需要根据商品所属的类目的ID号，来判断该商品是手机还是号卡。注意，商品类目表的CAT_ID号3至99是预留给系统将来的顶级类目的，顶级类目下面的二级类目CAT_ID从100开始编号（需要修改ORACLE的SEQUENCE）。编辑商品时，在手机类目中的所添加的商品，不可以更改到号卡类目中，反之亦然。
	 */
	@TableId
	private Integer catId;
	/**
	 * 类目名称
	 */
	private String catName;
	/**
	 * 类目描述
	 */
	private String catDesc;
	/**
	 * 父类目CAT_ID。0表示顶级类目，没有父类目。
	 */
	private Integer parentId;
	/**
	 * 前台显示排序
	 */
	private BigDecimal catSort;
	/**
	 * 关键词
	 */
	private String keywords;
	/**
	 * 静态化访问路径
	 */
	private String path;
	/**
	 * 分类标识：该分类的唯一标识，用于分类路径和模板标识，如用于生成前台静态页面，例如手机分类的标识为"SHOUJI",则置成HTTP://127.0.0.1/SHOUJI
	 */
	private String mark;
	/**
	 * 是否前台显示
	 */
	private BigDecimal isdisplay;
	/**
	 * 静态化面包屑导航全路径。如手机顶级分类的FULL_PATH是"/1/"
	 */
	private String fullPath;
	/**
	 * 0、不分类；1、实体；2、号卡；3、虚拟商品
	 */
	private BigDecimal catType;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@TableField(exist = false)
	private List<EbCatEntity> children;
}
