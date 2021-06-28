package com.mystudy.springtest.service;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * @author ：songdalin
 * @date ：2021-06-23 下午 09:30
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component("environmenttest")
public class EnvironmentTest implements EnvironmentAware {

    public String getName() {
        return name;
    }

    private String name;

    @Override
    public void setEnvironment(Environment environment) {
        name = environment.getProperty("spring.application.name");
    }

}
