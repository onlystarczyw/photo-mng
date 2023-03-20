package com.hfsf.photo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 评价评论表
 * 
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:01
 */
@TableName("tb_comment")
public class CommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * uuid
	 */
	@TableId
	private String id;
	/**
	 * 评论
	 */
	private String content;
	/**
	 * 套餐id
	 */
	private String preferId;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 回复的评论id
	 */
	private String parentId;
	/**
	 * 订单id
	 */
	private String orderId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPreferId() {
		return preferId;
	}
	public void setPreferId(String preferId) {
		this.preferId = preferId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	

}
