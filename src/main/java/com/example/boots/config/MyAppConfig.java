package com.example.boots.config;

import com.example.boots.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一个配置类，就是累替代之前的 Spring 配置文件
 * 在配置文件中 <bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中这个组件默认的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类 @Bean 给容器中添加组件了...");
        return new HelloService();
    }

}