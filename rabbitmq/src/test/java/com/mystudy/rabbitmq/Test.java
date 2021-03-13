package com.mystudy.rabbitmq;

import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;


/**
 * @author ：songdalin
 * @date ：2021-03-11 下午 03:50
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
public class Test {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @org.junit.Test
    public void test() {
        //convertAndSend(String exchange, String routingKey, Object message
        Map<String, Object> map = new HashMap<>();
        map.put("name", "ming");
        rabbitTemplate.convertAndSend("directExchange", "", map);
    }

}
