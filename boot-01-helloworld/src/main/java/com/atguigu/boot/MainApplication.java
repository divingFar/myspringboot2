package com.atguigu.boot;

import com.atguigu.boot.bean.Car;
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
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//        //3. 从容器中获取组件
//        Pet tom01 = run.getBean("tom", Pet.class);
//        Pet tom02 = run.getBean("tom", Pet.class);
//        System.out.println("组件：" + (tom01 == tom02));
//        //4. bean里面封装了返回配置对象的方法，从对象名可知bean本身就是一个被增强了的代理对象
//        //com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$5b5574fd@6dba847b
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//        // 验证Configuration(proxyBeanMethods = false) 注解
//        User user = bean.user01();
//        User user1 = bean.user01();
//        System.out.println("user==user1  " + (user == user1));
//        // 获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.print(bean1);
        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件：" + tom);
        boolean user01 = run.containsBean("user01");
        System.out.println("容器中User组件：" + user01);
        Car bean = run.getBean(Car.class);
        System.out.println(bean);

    }
}
