package com.atguigu.boot.bean;

public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }


    public User(String name) {
        this.name = name;
    }
}
