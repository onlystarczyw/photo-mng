package com.hfsf.photo.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hfsf.photo.entity.ReserveEntity;
import com.hfsf.photo.service.ReserveService;
import com.hfsf.photo.utils.PageUtils;
import com.hfsf.photo.utils.R;



/**
 * 预约表
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:01
 */
@RestController
@RequestMapping("photo/reserve")
public class ReserveController {
    @Autowired
    private ReserveService reserveService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = reserveService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") String id){
		ReserveEntity reserve = reserveService.getById(id);

        return R.ok().put("reserve", reserve);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody ReserveEntity reserve){
		reserveService.save(reserve);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody ReserveEntity reserve){
		reserveService.updateById(reserve);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody String[] ids){
		reserveService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
