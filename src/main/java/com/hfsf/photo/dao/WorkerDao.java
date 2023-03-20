package com.hfsf.photo.dao;

import com.hfsf.photo.entity.WorkerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 工作人员（摄影师）
 * 
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
@Mapper
public interface WorkerDao extends BaseMapper<WorkerEntity> {
	
}
