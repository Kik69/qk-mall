package com.qkmall.item.pojo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品，包含手机和号卡，通过在类目表中预置的手机类目和号卡类目来区分。裸机：手机机体，不包含任何通信服务和绑定的费用的机器
 * 
 * @author code
 * @email sunlightcs@gmail.com
 * @date 2023-04-24 19:25:30
 */
@Data
@TableName("eb_item")
public class EbItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品主键
	 */
	@TableId
	private Integer itemId;
	/**
	 * 商品名称、号卡卡号：文档标题可用作seo相关的title字段。提供重复标题检测功能,不允许本分类添加重复的商品，可以输入特殊字符
	 */
	private String itemName;
	/**
	 * 商品编号：自动生成，不可重复，添加完成后不可修改。编号规则：一级目录数字“1”+7位数递增，裸机起始编号   10000001。7位数递增满时自动升为8位数。
            编号根据EB_ITEM.CAT_TYPE获得，如实体商品为1（EB_ITEM.CAT_TYPE=1）
            （删除
            --实体起始编号：   10000001 虚拟起始编号：   20000001。
            --注意：商品是否为手机或号卡，用其所属的类目来区分，CAT_ID为1的为手机，CAT_ID为2的为号卡。）
	 */
	private String itemNo;
	/**
	 * 商品品牌：树状菜单，单选。显示关联本分类的品牌。
	 */
	private Integer brandId;
	/**
	 * 商品分类：树状菜单，单选，不可修改
	 */
	private Integer catId;
	/**
	 * 商品标签图片id
	 */
	private Integer tagImgId;
	/**
	 * 已废弃，请使用ITEM_TAG_IMG_ID指定标签图片。
            标签图片：1.独家;2.推荐;3.惊爆价。可不选或单选，叠加在前台商品图片上，多用于促销
	 */
	private BigDecimal tagImg;
	/**
	 * 0否，1是，默认1
	 */
	private BigDecimal isNew;
	/**
	 * 0否，1是，默认0
	 */
	private BigDecimal isGood;
	/**
	 * 0否，1是，默认0
	 */
	private BigDecimal isHot;
	/**
	 * 促销语：用于前台显示、关键词搜索
	 */
	private String promotion;
	/**
	 * 实体商品审核状态(号卡没有审核)：0：待审核；1：审核通过；2：审核未通过；
	 */
	private BigDecimal auditStatus;
	/**
	 * 上下架状态：0.为上架 1.为下架
	 */
	private BigDecimal showStatus;
	/**
	 * 上传图片：最多5张图片的存储地址，用分隔符分开。可增加上传图片，具备删除和设置排序功能，最多只能上传五张图片，图片上传后共保存5个尺寸（原始尺寸，缩放生成4个尺寸 50x50 、 100x100 、 150x150、300x300），各尺寸提供前台页面调用。
            每张图片上传之后的图片重命名规则为：上传用户ID+日期时间（精确到秒）+6位英文数字随机码,  根据图片格式存放在不同的文件夹，方便未来扩展。
            每张图片大小遵循“系统设置”对附件上传大小的限制。一期默认图片格式支持jpg、gif、png(3个格式不区分大小写)，大小不超过3MB，水印功能一期不开发，图片裁剪功能一期不开发
	 */
	private String imgs;
	/**
	 * 页面关键词
	 */
	private String keywords;
	/**
	 * 页面描述：文本区
	 */
	private String pageDesc;
	/**
	 * 是否删除：0：未删除；1：已经删除；默认值：0
	 */
	private BigDecimal itemRecycle;
	/**
	 * 上架时间
	 */
	private Date onSaleTime;
	/**
	 * 
	 */
	private Date checkTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Integer updateUserId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Integer checkerUserId;
	/**
	 * 未参加活动的商品的静态化页面的发布路径（存相对路径）
	 */
	private String fullPathDeploy;
	/**
	 * 参加活动的商品的静态化页面的发布路径
	 */
	private String fullPathDeployOffer;
	/**
	 * 
	 */
	private Integer originalItemId;
	/**
	 * 0是历史记录;1最新
	 */
	private BigDecimal lastStatus;
	/**
	 * 
	 */
	private Integer merchantId;
	/**
	 * 
	 */
	private BigDecimal itemSort;
	/**
	 * 
	 */
	private BigDecimal sales;
	/**
	 * 
	 */
	private Integer createUserId;
	/**
	 * 号码靓度：单选框，1.超级靓号、2.普通靓号、3.普通号
	 */
	private BigDecimal simLevel;
	/**
	 * 赠品描述
	 */
	private String giftDesc;
	/**
	 * 赠品图片
	 */
	private String giftImg;
	/**
	 * 赠品显示类型
	 */
	private String giftShowType;
	/**
	 * 
	 */
	private String imgSize1;

}
