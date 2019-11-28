package com.xc.mail.springboot;

import com.xc.mail.SpringbootApplication;
import com.xc.mail.service.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * on 2019/11/28 11:24
 *
 * @author zhuweitao
 */
// SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
// 指定我们SpringBoot工程的Application启动类
@SpringBootTest(classes = SpringbootApplication.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class HelloServiceTest {

    @Resource
    private HelloService helloService;

    @Test
    public void testGetName(){
        Assert.assertEquals("hello",helloService.getName());

    }
}
