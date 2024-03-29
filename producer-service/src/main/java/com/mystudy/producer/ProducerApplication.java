package com.mystudy.producer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 04:04
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
@MapperScan(value = {"com.mystudy.producer.mapper"})
public class ProducerApplication {

    public static void main(String[] args){
        SpringApplication.run(ProducerApplication.class, args);
    }
}
