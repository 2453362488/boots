package com.example.boots;

import com.example.boots.bean.Person;
import com.example.boots.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot 单元测试；
 * 可以再测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootsApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        // 日志的级别
        // 由低到高     trace < debug < info < warn < error
        // 可以调整输出的日志级别，日志就只会在这个级别以后的高级别生效
        logger.trace("这是 trace 日志...");
        logger.debug("这是 debug 日志...");
        // SpringBoot 默认给我们使用的是 info 级别的，没有指定级别的就用 SpringBoot 默认规定的级别：root 级别
        logger.info("这是 info 日志...");
        logger.warn("这是 warn 日志...");
        logger.error("这是 error 日志...");
    }

}
