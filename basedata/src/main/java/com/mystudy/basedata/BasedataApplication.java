package com.mystudy.basedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 02:08
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class BasedataApplication {

    public static void main(String[] args){
        SpringApplication.run(BasedataApplication.class, args);
    }
}
