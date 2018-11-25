package com.zlp.zlpinspringboot.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.Environment;

/**
 * @ClassName BeforeApplicationListener
 * @Description Before {@link ConfigFileApplicationListener} 实现
 * @Author puck
 * @Date 25/11/2018 15:47
 * @Version 1.0
 */
public class BeforeApplicationListener implements SmartApplicationListener, Ordered {

    @Override
    public int getOrder() {//比ConfigFileApplicationListener优先级高一级
        return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
    }

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        return true;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent preparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            Environment environment = preparedEvent.getEnvironment();
            System.out.println("environment.getProperty(\"name\") : " + environment.getProperty("name"));
        }
        if (event instanceof ApplicationPreparedEvent) {
        }
    }
}
