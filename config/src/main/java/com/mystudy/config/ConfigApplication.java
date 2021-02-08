package com.mystudy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.security.auth.login.Configuration;

/**
 * @author ：songdalin
 * @date ：2021-02-08 上午 10:58
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class, args);
    }
}
