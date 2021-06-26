package com.mystudy.nacos2.controller;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2021-06-26 上午 10:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("")
public class TestController implements EnvironmentAware {

    private String port;

    @GetMapping("/getstr")
    public String getStr(String a) {
        return "nacos2 out : " + a + "port: " + port;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.port = environment.getProperty("server.port");
    }
}
