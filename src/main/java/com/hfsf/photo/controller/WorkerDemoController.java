package com.hfsf.photo.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hfsf.photo.entity.WorkerDemoEntity;
import com.hfsf.photo.service.WorkerDemoService;
import com.hfsf.photo.utils.PageUtils;
import com.hfsf.photo.utils.R;



/**
 * 摄影师作品
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
@RestController
@RequestMapping("photo/workerdemo")
public class WorkerDemoController {
    @Autowired
    private WorkerDemoService workerDemoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = workerDemoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") String id){
		WorkerDemoEntity workerDemo = workerDemoService.getById(id);

        return R.ok().put("workerDemo", workerDemo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody WorkerDemoEntity workerDemo){
		workerDemoService.save(workerDemo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody WorkerDemoEntity workerDemo){
		workerDemoService.updateById(workerDemo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody String[] ids){
		workerDemoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
