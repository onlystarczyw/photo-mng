package com.hfsf.photo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.PreferentialDao;
import com.hfsf.photo.entity.PreferentialEntity;
import com.hfsf.photo.service.PreferentialService;
import com.hfsf.photo.utils.PageUtils;


@Service("preferentialService")
public class PreferentialServiceImpl extends ServiceImpl<PreferentialDao, PreferentialEntity> implements PreferentialService {


}