package com.mystudy.stream.controller;

import com.mystudy.stream.conf.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2021-03-19 下午 04:31
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping
public class Controller {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/send")
    public void send(){
        streamClient.output().send(MessageBuilder.withPayload("hello world").build());
        System.out.println("发送了一条消息");
    }
}
