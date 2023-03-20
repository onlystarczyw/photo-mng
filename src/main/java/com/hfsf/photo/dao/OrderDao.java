package com.hfsf.photo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hfsf.photo.entity.OrderEntity;

/**
 * 订单
 * 
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
