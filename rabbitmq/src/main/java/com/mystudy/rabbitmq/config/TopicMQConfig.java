package com.mystudy.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：songdalin
 * @date ：2021-03-15 上午 11:06
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class TopicMQConfig {

    @Bean("topicExchange")
    public TopicExchange topicExchange() {
        //DirectExchange(String name, boolean durable, boolean autoDelete, Map<String, Object> arguments)
        return new TopicExchange("Topic-Exchange",true,false,null);
    }

    @Bean("topic1Queue")
    public Queue topic1Queue() {

        Map<String, Object> map = new HashMap<>();
        // 队列中的消息未被消费则30秒后过期
        //map.put("x-message-ttl", 30000);
        return new Queue("Topic1-Queue",true,false,false, map);
    }

    @Bean("topic2Queue")
    public Queue topic2Queue() {

        Map<String, Object> map = new HashMap<>();
        // 队列中的消息未被消费则30秒后过期
        //map.put("x-message-ttl", 30000);
        return new Queue("Topic2-Queue",true,false,false, map);
    }

    @Bean
    public Binding bindQueue1(@Qualifier("topicExchange") TopicExchange exchange,
                              @Qualifier("topic1Queue") Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("mq.topic1.#");
    }

    @Bean
    public Binding bindQueue2(@Qualifier("topicExchange") TopicExchange exchange,
                              @Qualifier("topic2Queue") Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("mq.topic2");
    }
}
