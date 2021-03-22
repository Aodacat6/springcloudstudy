package com.mystudy.stream.conf;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import static com.mystudy.stream.conf.StreamClient.INPUT;

/**
 * @author ：songdalin
 * @date ：2021-03-19 下午 04:08
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
/**
 * @EnableBinding 该注解绑定 实现方法和channel，用于消息处理
 */
@EnableBinding(value = {StreamClient.class})
public class StreamReceiver {

    //@StreamListener(value = StreamClient.INPUT , condition = "")
    public void receive(String message) {
        System.out.println("接收到一条消息：" + message);
    }
}
