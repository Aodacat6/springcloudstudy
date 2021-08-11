/*
package com.mystudy.producer.configuration;

import com.mystudy.producer.MyRibbonRule;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

*/
/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 04:32
 * @description：ribbon负载策略配置
 * @modified By：
 * @version: 1.0
 *//*

@Configuration
public class RibbonConfig {

    @Bean
    public IRule iRule () {
        //返回负载策略
        //一、随机
        //return new RandomRule();
        //二、轮询
        //return new RoundRobinRule();
        //三、可用过滤策略
        //return new AvailabilityFilteringRule();
        //四、响应时间权重策略
        //return new WeightedResponseTimeRule();
        //五、轮询失败重试策略
        //return new RetryRule();
        //六、并发量最小可用策略
        //return new BestAvailableRule();

        return new MyRibbonRule();
    }
}
*/
