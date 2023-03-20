package com.hfsf.photo.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 订单
 * 
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
@TableName("tb_order")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * uuid
	 */
	@TableId
	private String id;
	/**
	 * 下单时间
	 */
	private Date createTime;
	/**
	 * 1未支付，2支付
	 */
	private Integer state;
	/**
	 * 支付时间
	 */
	private Date payTime;
	/**
	 * 套餐id
	 */
	private String preferId;
	/**
	 * 用户id
	 */
	private String userId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
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
	
	

}
