package com.hfsf.photo.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hfsf.photo.entity.ReserveEntity;
import com.hfsf.photo.utils.PageUtils;

/**
 * 预约表
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:01
 */
public interface ReserveService extends IService<ReserveEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

