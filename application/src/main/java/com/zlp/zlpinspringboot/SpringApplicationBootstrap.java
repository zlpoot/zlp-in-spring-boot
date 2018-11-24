package com.zlp.zlpinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * {@link SpringApplication} 引导类
 * @ClassName SpringApplicationBootstrap
 * @Description TODO
 * @Author puck
 * @Date 24/11/2018 16:56
 * @Version 1.0
 *
 */

public class SpringApplicationBootstrap {

    public static void main(String[] args) {
//        SpringApplication.run(ApplicationConfiguration.class,args);

        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springBootApplication = new SpringApplication();
        springBootApplication.setSources(sources);
        ConfigurableApplicationContext context = springBootApplication.run(args);
//        System.out.println("Bean:"+context.getBean(ApplicationConfiguration.class));

    }

    @SpringBootApplication
    public static class  ApplicationConfiguration {

    }
}
