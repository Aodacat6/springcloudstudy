package com.mystudy.producer.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 02:14
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class RestConfig {

    @Bean("restTemplate")
    //开启ribbon
    /*

    ribbon
    客户端控制负载均衡
    默认轮询

     */
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
