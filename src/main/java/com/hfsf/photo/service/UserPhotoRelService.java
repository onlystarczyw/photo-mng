package com.hfsf.photo.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hfsf.photo.entity.UserPhotoRelEntity;
import com.hfsf.photo.utils.PageUtils;

/**
 * 
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:03
 */
public interface UserPhotoRelService extends IService<UserPhotoRelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

