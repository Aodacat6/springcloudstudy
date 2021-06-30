package com.mystudy.springtest;

import com.mystudy.springtest.properties.MyAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author ：songdalin
 * @date ：2021-03-30 上午 09:33
 * @description：
 * @modified By：
 * @version: 1.0
 */
@EnableConfigurationProperties(MyAddress.class)
@SpringBootApplication
public class TestApplication {

    public static void main(String[] args){
        SpringApplication.run(TestApplication.class, args);
    }
}
