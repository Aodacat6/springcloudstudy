package com.mystudy.nacos2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：songdalin
 * @date ：2021-06-24 下午 06:42
 * @description：
 * @modified By：
 * @version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Nacos2Application {

    public static void main(String[] args){
        SpringApplication.run(Nacos2Application.class, args);
    }
}
