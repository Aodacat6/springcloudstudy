package com.mystudy.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：songdalin
 * @date ：2021-02-23 上午 11:02
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class DirectMQConfig {

    @Bean("directExchange")
    public DirectExchange directExchange() {
        //DirectExchange(String name, boolean durable, boolean autoDelete, Map<String, Object> arguments)
        return new DirectExchange("Direct-Exchange",true,false,null);
    }

    @Bean("testQueue")
    public Queue testQueue() {
        //String name, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments

        // durable:是否持久化,默认是false,持久化队列：会被存储在磁盘上，当消息代理重启时仍然存在，暂存队列：当前连接有效
        // exclusive:默认也是false，只能被当前创建的连接使用，而且当连接关闭后队列即被删除。此参考优先级高于durable
        // autoDelete:是否自动删除，当没有生产者或者消费者使用此队列，该队列会自动删除。
        // arguments：设置可用配置参数
        Map<String, Object> map = new HashMap<>();
        // 队列中的消息未被消费则30秒后过期
        map.put("x-message-ttl", 30000);
        return new Queue("Direct-Queue",true,false,false, map);
    }

    @Bean
    public Binding bindDirect(@Qualifier("directExchange") DirectExchange exchange,
                              @Qualifier("testQueue") Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("mq.direct");
    }
}
