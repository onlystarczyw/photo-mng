package com.hfsf.photo.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfsf.photo.dao.AddressDao;
import com.hfsf.photo.entity.AddressEntity;
import com.hfsf.photo.service.AddressService;

@Service("addressService")
public class AddressServiceImpl extends ServiceImpl<AddressDao, AddressEntity> implements AddressService {


}