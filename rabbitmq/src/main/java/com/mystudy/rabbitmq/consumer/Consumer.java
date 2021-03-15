package com.mystudy.rabbitmq.consumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author ：songdalin
 * @date ：2021-03-15 下午 05:58
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class Consumer {

    @Value("${server.port}")
    private String port;

    /**
     * 工作队列模式：工作队列1
     * @param message
     */
    //@RabbitListener(queues = {"Direct-Queue"})
    public void listen(Message message) {
        System.out.println(port + " listen:" + new String(message.getBody()));
    }

    /**
     * 工作队列模式：工作队列2
     * @param message
     */
    //@RabbitListener(queues = {"Direct-Queue"})
    public void listen1(Message message) {
        System.out.println(port + " listen1:" + new String(message.getBody()));
    }

    /**
     * 消费者ACK机制
     * @param message
     */
    //@RabbitListener(queues = {"Direct-Queue"})
    public void listenForAck(Message message, Channel channel) throws IOException {
        //偶数消费
        if (0 == Integer.parseInt(new String(message.getBody()))%2) {
            //basicAck(long deliveryTag, boolean multiple)
            //deliveryTag :消息唯一id
            //multiple: 是否批量操作 ，如果是，则将消息唯一id小于id的消息全部确认
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            System.out.println("消费掉：" + new String(message.getBody()));
        }else {
            //奇数拒绝
            //basicNack(long deliveryTag, boolean multiple, boolean requeue)
            //deliveryTag:该消息的index。
            //multiple：是否批量. true：将一次性拒绝所有小于deliveryTag的消息。
            //requeue：是否重新入队列
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
            System.out.println("拒绝：" + new String(message.getBody()));
        }
    }


}
