package com.zlp.zlpinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * @ClassName AfterHelloWorldApplicationListener
 * @Description TODO
 * @Author puck
 * @Date 24/11/2018 21:09
 * @Version 1.0
 */
public class AfterHelloWorldApplicationListener
        implements ApplicationListener<ContextRefreshedEvent>, Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("HelloWorld : " + contextRefreshedEvent.getApplicationContext().getId()
                + ", timestamp" + contextRefreshedEvent.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
