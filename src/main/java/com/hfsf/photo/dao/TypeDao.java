package com.hfsf.photo.dao;

import com.hfsf.photo.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 摄影风格类型
 * 
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:03
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
