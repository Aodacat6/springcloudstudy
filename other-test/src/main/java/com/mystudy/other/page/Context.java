package com.mystudy.other.page;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：songdalin
 * @date ：2021-03-13 下午 01:44
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Context {

    /**
     * spring循环出入测试
     *
     * 循环注入两种情况：
     *      1、构造器注入
     *      2、属性注入
     * 构造器注入：即在类构造的时候循环注入，这种方式无解，spring也处理不了
     * 属性注入：spring可以处理这种循环注入
     *
     * 两个概念：
     *      1、类的实例化：即类执行完构造器后，还没填充属性
     *      2、类的初始化：类完成属性注入
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanConfig.class);
        applicationContext.getBean(Teacher.class).teach();

    }
}
