package com.mystudy.controller;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public void test() {

                 String body = "hello,test rabbitTemplage!";
                 MessageProperties properties = new MessageProperties();
                 properties.setContentEncoding("utf-8");
                 properties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
                 properties.setPriority(1);
                 properties.setHeader("nihao:", "yes!");
                 Message message = new Message(body.getBytes(), properties);
         //        MessagePostProcessor参数是在消息发送过程中动态修改消息属性的类
/*                 rabbitTemplate.convertAndSend("test.direct01", "mq.direct", message,new MessagePostProcessor() {

                     @Override
             public Message postProcessMessage(Message message) throws AmqpException {
                 //                修改属性
                                 message.getMessageProperties().setHeader("nihao:", "no");
                 //                添加属性
                                 message.getMessageProperties().setHeader("新添加属性：", "添加属性1");
                                 return message;
                             }
         });*/


         //        发送objcet类型
                 rabbitTemplate.convertAndSend("test.topic01", "mq.topic", "send object type message!!!");
                 System.out.println("发送完毕！！！");
    }
}
