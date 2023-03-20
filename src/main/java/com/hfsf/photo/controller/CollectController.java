package com.hfsf.photo.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hfsf.photo.entity.CollectEntity;
import com.hfsf.photo.service.CollectService;
import com.hfsf.photo.utils.PageUtils;
import com.hfsf.photo.utils.R;



/**
 * 收藏表
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
@RestController
@RequestMapping("photo/collect")
public class CollectController {
    @Autowired
    private CollectService collectService;

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
    @RequestMapping("/info/{userId}")
        public R info(@PathVariable("userId") String userId){
		CollectEntity collect = collectService.getById(userId);

        return R.ok().put("collect", collect);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody CollectEntity collect){
		collectService.save(collect);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody CollectEntity collect){
		collectService.updateById(collect);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody String[] userIds){
		collectService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
