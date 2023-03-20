package com.hfsf.photo.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hfsf.photo.entity.PreferentialEntity;
import com.hfsf.photo.service.PreferentialService;
import com.hfsf.photo.utils.PageUtils;
import com.hfsf.photo.utils.R;



/**
 * 摄影套餐
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:03
 */
@RestController
@RequestMapping("photo/preferential")
public class PreferentialController {
    @Autowired
    private PreferentialService preferentialService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = null;

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") String id){
		PreferentialEntity preferential = preferentialService.getById(id);

        return R.ok().put("preferential", preferential);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody PreferentialEntity preferential){
		preferentialService.save(preferential);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody PreferentialEntity preferential){
		preferentialService.updateById(preferential);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody String[] ids){
		preferentialService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
