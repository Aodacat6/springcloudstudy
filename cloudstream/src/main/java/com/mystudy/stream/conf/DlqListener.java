package com.mystudy.stream.conf;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-03-19 下午 05:30
 * @description： 死信队列消费
 * @modified By：
 * @version: 1.0
 */
@Component
@EnableBinding(StreamClient.class)
public class DlqListener {

    /**
     * 死信队列消费
     * @param message
     */
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue("myMqStream.groupA.dlq")
                    , exchange = @Exchange("DLX")
                    , key = "myMqStream.groupA"
            )
    )
    public void listen(Message message) {
        System.out.println("死信队列消费：" + new String(message.getBody()));
    }
}
