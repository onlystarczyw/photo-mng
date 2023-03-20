package com.hfsf.photo.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.CollectDao;
import com.hfsf.photo.entity.CollectEntity;
import com.hfsf.photo.service.CollectService;


@Service("collectService")
public class CollectServiceImpl extends ServiceImpl<CollectDao, CollectEntity> implements CollectService {


}