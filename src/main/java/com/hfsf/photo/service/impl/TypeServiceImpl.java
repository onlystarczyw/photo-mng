package com.hfsf.photo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.TypeDao;
import com.hfsf.photo.entity.TypeEntity;
import com.hfsf.photo.service.TypeService;
import com.hfsf.photo.utils.PageUtils;


@Service("typeService")
public class TypeServiceImpl extends ServiceImpl<TypeDao, TypeEntity> implements TypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        return null;
    }

}