package com.mystudy.springtest.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-06-28 下午 08:51
 * @description：一些aware接口测试
 * @modified By：
 * @version: 1.0
 */
@Component
public class SomeAwareInterfaceTest implements ApplicationContextAware, BeanNameAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SomeAwareInterfaceTest.applicationContext = applicationContext;
    }

    public static  <T> T getByName(String name) {
        return (T)applicationContext.getBean(name);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("获取bean名字：" + name);
    }
}
