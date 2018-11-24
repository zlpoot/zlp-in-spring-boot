package com.zlp.zlpinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWorld {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @ClassName HelloWorldApplicationListener
 * @Description TODO
 * @Author puck
 * @Date 24/11/2018 21:05
 * @Version 1.0
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("HelloWorld : " + contextRefreshedEvent.getApplicationContext().getId()
                + ", timestamp" + contextRefreshedEvent.getTimestamp());
    }
}
