package com.mystudy.producer.configuration;

import com.mystudy.producer.MyRibbonRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 04:32
 * @description：ribbon负载策略配置
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule iRule () {
        //返回负载策略
        //return new RandomRule();
        return new MyRibbonRule();
    }
}
