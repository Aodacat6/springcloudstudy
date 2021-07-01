package com.mystudy.springtest.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-07-01 下午 08:01
 * @description：
 * @modified By：
 * @version: 1.0
 */
//@Lazy
@Component
@Scope(value = "prototype")
public class Bean implements InitializingBean, DisposableBean {

    private  long time;

    public long getTime() {
        return time;
    }

    public Bean() {
        time = System.currentTimeMillis();
        System.out.println("================Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("=================afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("=================destroy");

    }
}
