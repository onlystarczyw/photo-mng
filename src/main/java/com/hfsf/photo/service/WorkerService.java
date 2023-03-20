package com.hfsf.photo.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hfsf.photo.entity.WorkerEntity;
import com.hfsf.photo.utils.PageUtils;

/**
 * 工作人员（摄影师）
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
public interface WorkerService extends IService<WorkerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

