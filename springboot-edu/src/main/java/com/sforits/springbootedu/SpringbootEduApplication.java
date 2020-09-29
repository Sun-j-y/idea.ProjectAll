package com.sforits.springbootedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 注解相当与@EnableAutoConfiguration , @ComponentScan 和 @Configuration 三个注解
 * @EnableAutoConfiguration 作用: 开启自动配置 初始化spring环境 初始化springmvc环境
 * 详细作用: 类级别的注释(只用作用在类上),这个注释告诉Spring Boot根据所添加的jar依赖关系“猜测”您如何配置Spring。由于spring-boot-starter-web
 * 添加了Tomcat和Spring MVC，因此自动配置假定您正在开发Web应用程序并相应地设置Spring。
 * @ComponentScan 作用: 用来扫描相关注解(只能作用在类上)	扫描范围: 当前入口类所在包及其子包
 *
 * @Configuration 作用:
 */
@SpringBootApplication
//@EnableAspectJAutoProxy
//@ImportResource("spring.xml") // 使用xml方式, 导入Bean配置文件
public class SpringbootEduApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEduApplication.class, args);
    }

}
