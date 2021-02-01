package com.mystudy.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 05:19
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args){
        SpringApplication.run(ZuulApplication.class, args);
    }
}
