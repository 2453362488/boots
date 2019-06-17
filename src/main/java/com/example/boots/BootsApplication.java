package com.example.boots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class BootsApplication {

    // Spring 应用启动起来
    public static void main(String[] args) {
        SpringApplication.run(BootsApplication.class, args);
    }

}
