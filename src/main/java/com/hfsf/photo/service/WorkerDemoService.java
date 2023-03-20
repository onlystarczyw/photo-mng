package com.hfsf.photo.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hfsf.photo.entity.WorkerDemoEntity;
import com.hfsf.photo.utils.PageUtils;

/**
 * 摄影师作品
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
public interface WorkerDemoService extends IService<WorkerDemoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

