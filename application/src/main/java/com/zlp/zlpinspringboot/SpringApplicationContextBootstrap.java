package com.zlp.zlpinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName SpringApplictionContextBootstrap
 * @Description Spring 应用上下文 引导类
 * @Author puck
 * @Date 25/11/2018 19:31
 * @Version 1.0
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println("ConfigurableApplicationContext 类型： " + context.getClass().getName());

        context.close();


    }


}
