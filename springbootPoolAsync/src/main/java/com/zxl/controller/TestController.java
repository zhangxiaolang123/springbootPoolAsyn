package com.zxl.controller;

import com.zxl.task.AsynTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxl on 2019/5/1.
 */
@RestController
public class TestController {

    @Autowired
    private AsynTask asynTask;

    @GetMapping("/testAsynTask")
    public String test(@RequestParam("name")String name){
        //异步并在线程池里开启一个子线程
       asynTask.test(name);
        return name;
    }
}
