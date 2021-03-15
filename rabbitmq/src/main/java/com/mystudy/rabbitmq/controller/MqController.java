package com.mystudy.rabbitmq.controller;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author ：songdalin
 * @date ：2021-03-12 下午 05:48
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("")
public class MqController {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/test")
    public void test() {

        Random random = new Random();
        int num = random.nextInt(10);

        //消息过期方式二：给每一条消息设置过期时间
        MessageProperties properties = new MessageProperties();
        //延迟发送
        //properties.setDelay(10000);
        //每条消息过期时间
        properties.setExpiration("10000");
        //byte[] bytes = "这是一条测试消息".getBytes();
        byte[] bytes = String.valueOf(num).getBytes();
        Message message = new Message(bytes, properties);
        //  路由key，如果不对，不能发布到队列上
        //rabbitTemplate.convertAndSend("Direct-Exchange", "mq.direct", "这是一条测试消息!!!");
        rabbitTemplate.convertAndSend("Direct-Exchange", "mq.direct", message);
        System.out.println("发送完毕！！！");
    }

    @GetMapping("/topic")
    public void topic() {
        rabbitTemplate.convertAndSend("Topic-Exchange", "mq.topic1.lala", "这是topic1 的消息");
        rabbitTemplate.convertAndSend("Topic-Exchange", "mq.topic2", "这是topic2 的消息");
        System.out.println("发送完毕！！！");
    }


}
