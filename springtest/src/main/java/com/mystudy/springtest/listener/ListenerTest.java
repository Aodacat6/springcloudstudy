package com.mystudy.springtest.listener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-06-29 下午 09:17
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class ListenerTest {

    @EventListener(value = ContextRefreshedEvent.class)
    public void listen(ContextRefreshedEvent event) {
        System.out.println("注解out event: " + event);
    }
}
