package com.zlp.zlpinspringboot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName SpringApplicationEventBootstrap
 * @Description Spring 应用事件引导类
 * @Author puck
 * @Date 25/11/2018 09:59
 * @Version 1.0
 */
public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //注册应用事件监听
        context.addApplicationListener(event -> {
            System.out.println("监听到事件：" + event);
        });

        // 启动上下文
        context.refresh();

        context.publishEvent("hello");
        context.publishEvent("world");
        context.publishEvent(new ApplicationEvent("哈哈哈") {

        });


        // 关闭上下文
        context.close();
    }

}
