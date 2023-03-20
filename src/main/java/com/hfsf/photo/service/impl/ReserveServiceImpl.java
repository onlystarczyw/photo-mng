package com.hfsf.photo.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.ReserveDao;
import com.hfsf.photo.entity.ReserveEntity;
import com.hfsf.photo.service.ReserveService;
import com.hfsf.photo.utils.PageUtils;


@Service("reserveService")
public class ReserveServiceImpl extends ServiceImpl<ReserveDao, ReserveEntity> implements ReserveService {


    public PageUtils queryPage(Map<String, Object> params) {
    	
		return null;
    }
}