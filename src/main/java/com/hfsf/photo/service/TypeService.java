package com.hfsf.photo.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hfsf.photo.entity.TypeEntity;
import com.hfsf.photo.utils.PageUtils;

/**
 * 摄影风格类型
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:03
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

