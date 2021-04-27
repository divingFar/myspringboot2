package com.atguigu.boot.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "mycar")
@Data
@NoArgsConstructor
@Slf4j
public class Car {
    private String brand;
    private Integer price;

    public static void main(String[] args) {
        log.info("helol");
    }


}
