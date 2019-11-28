package com.xc.mail.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * on 2019/11/28 11:14
 *项目启动需要加载的数据，执行的代码
 *  Order 是启动顺序
 * @author zhuweitao
 */
@Component
@Order(value = 1)
public class MyStartupRunner1 implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>1111>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
