package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//SpringBootApplication等同于下面三个注解
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.atguigu")
public class MainApplication {
    public static void main(String[] args) {
        //1. 返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2 .查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        
    }
}
