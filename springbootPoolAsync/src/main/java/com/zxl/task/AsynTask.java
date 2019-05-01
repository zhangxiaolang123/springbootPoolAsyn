package com.zxl.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by zxl on 2019/5/1.
 */
@Component
public class AsynTask {

    @Async("myTaskAsyncPool")
    public void test(String name) {
        System.out.println(name);

    }

    @Async("myTaskAsyncPool")
    public void test2(int age) {
        System.out.println(age);

    }
}
