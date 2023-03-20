package com.hfsf.photo.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hfsf.photo.entity.UserPhotoRelEntity;
import com.hfsf.photo.service.UserPhotoRelService;
import com.hfsf.photo.utils.PageUtils;
import com.hfsf.photo.utils.R;



/**
 * 
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:03
 */
@RestController
@RequestMapping("photo/userphotorel")
public class UserPhotoRelController {
    @Autowired
    private UserPhotoRelService userPhotoRelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userPhotoRelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
        public R info(@PathVariable("userId") String userId){
		UserPhotoRelEntity userPhotoRel = userPhotoRelService.getById(userId);

        return R.ok().put("userPhotoRel", userPhotoRel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody UserPhotoRelEntity userPhotoRel){
		userPhotoRelService.save(userPhotoRel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody UserPhotoRelEntity userPhotoRel){
		userPhotoRelService.updateById(userPhotoRel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody String[] userIds){
		userPhotoRelService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
