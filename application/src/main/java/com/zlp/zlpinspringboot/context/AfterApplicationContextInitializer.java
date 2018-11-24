package com.zlp.zlpinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @ClassName AfterApplicationContextInitializer
 * @Description TODO
 * @Author puck
 * @Date 24/11/2018 20:49
 * @Version 1.0
 */
public class AfterApplicationContextInitializer implements ApplicationContextInitializer, Ordered {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("After application.id = " + configurableApplicationContext.getId()
        );
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
