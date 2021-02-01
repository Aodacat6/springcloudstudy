package com.mystudy.ds_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 01:28
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class DS_EurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(DS_EurekaApplication.class, args);
    }
}
