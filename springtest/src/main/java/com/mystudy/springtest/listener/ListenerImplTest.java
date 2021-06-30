package com.mystudy.springtest.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ：songdalin
 * @date ：2021-06-29 下午 09:22
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class ListenerImplTest implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("实现out： " + event);
    }
    public static void main(String[] args){
        Set<Long> set = new HashSet<>();
        set.add(1L);
    }
}
