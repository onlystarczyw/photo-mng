package com.hfsf.photo.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hfsf.photo.entity.WorkerEntity;
import com.hfsf.photo.service.WorkerService;
import com.hfsf.photo.utils.PageUtils;
import com.hfsf.photo.utils.R;



/**
 * 工作人员（摄影师）
 *
 * @author admin
 * @email 
 * @date 2023-03-17 15:37:02
 */
@RestController
@RequestMapping("photo/worker")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = workerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") String id){
		WorkerEntity worker = workerService.getById(id);

        return R.ok().put("worker", worker);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody WorkerEntity worker){
		workerService.save(worker);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody WorkerEntity worker){
		workerService.updateById(worker);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody String[] ids){
		workerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
