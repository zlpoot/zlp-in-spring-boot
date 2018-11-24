package com.zlp.zlpinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @ClassName HelloWordApplicationContextInitializer
 * @Description TODO
 * @Author puck
 * @Date 24/11/2018 20:42
 * @Version 1.0
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWordApplicationContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C> {

    @Override
    public void initialize(C c) {
        System.out.println("ConfigurableApplicationContext.id="+c.getId());
    }

}
