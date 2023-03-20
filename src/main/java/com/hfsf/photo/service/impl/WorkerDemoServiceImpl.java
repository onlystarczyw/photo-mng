package com.hfsf.photo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.WorkerDemoDao;
import com.hfsf.photo.entity.WorkerDemoEntity;
import com.hfsf.photo.service.WorkerDemoService;
import com.hfsf.photo.utils.PageUtils;


@Service("workerDemoService")
public class WorkerDemoServiceImpl extends ServiceImpl<WorkerDemoDao, WorkerDemoEntity> implements WorkerDemoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        return null;
    }

}