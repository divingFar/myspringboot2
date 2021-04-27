package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1. 配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods
 */
@Import({User.class, DBHelper.class})
//@ConditionalOnBean(type = "tom")
@Configuration() //告诉SpringBoot这是一个配置类 == 配置文件
@EnableConfigurationProperties(Car.class)
//1. 开启Car配置绑定功能
//2. 把这个car组件自动注入到容器中
public class MyConfig {
   // @ConditionalOnBean(type = "tom")
    @Bean//给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User user01() {
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean(value = "tom22")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }
}
