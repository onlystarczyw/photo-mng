package com.hfsf.photo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.WorkerDao;
import com.hfsf.photo.entity.WorkerEntity;
import com.hfsf.photo.service.WorkerService;
import com.hfsf.photo.utils.PageUtils;


@Service("workerService")
public class WorkerServiceImpl extends ServiceImpl<WorkerDao, WorkerEntity> implements WorkerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        return null;
    }

}