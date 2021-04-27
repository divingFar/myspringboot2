package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Car car;
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String helloSpringBoot() {
        return "hello SpringBoot2 , i am coming!";
    }

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
