package com.mystudy.producer.configuration;

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
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
