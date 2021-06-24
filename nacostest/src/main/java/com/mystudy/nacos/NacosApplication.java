package com.mystudy.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：songdalin
 * @date ：2021-06-24 下午 06:42
 * @description：
 * @modified By：
 * @version: 1.0
 */
@EnableDiscoveryClient
public class NacosApplication {

    public static void main(String[] args){
        SpringApplication.run(NacosApplication.class, args);
    }
}
