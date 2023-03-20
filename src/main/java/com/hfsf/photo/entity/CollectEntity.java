package com.hfsf.photo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


/**
 * 收藏表
 * 
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
@TableName("tb_collect")
public class CollectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId
	private String userId;
	/**
	 * 套餐id、摄影作品id
	 */
	private String bizId;
	/**
	 * 1套餐，2摄影作品
	 */
	private Integer type;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBizId() {
		return bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	

}
