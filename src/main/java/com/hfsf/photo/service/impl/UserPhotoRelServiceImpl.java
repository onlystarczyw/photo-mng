package com.hfsf.photo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.UserPhotoRelDao;
import com.hfsf.photo.entity.UserPhotoRelEntity;
import com.hfsf.photo.service.UserPhotoRelService;
import com.hfsf.photo.utils.PageUtils;


@Service("userPhotoRelService")
public class UserPhotoRelServiceImpl extends ServiceImpl<UserPhotoRelDao, UserPhotoRelEntity> implements UserPhotoRelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        return null;
    }

}