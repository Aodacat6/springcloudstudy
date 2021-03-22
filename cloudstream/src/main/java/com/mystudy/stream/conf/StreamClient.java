package com.mystudy.stream.conf;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

import javax.print.DocFlavor;
import java.io.Serializable;

/**
 * @author ：songdalin
 * @date ：2021-03-19 下午 03:53
 * @description：
 * @modified By：
 * @version: 1.0
 */

//继承序列化
public interface StreamClient extends Serializable {


    /**
     * 输入消息channel
     *
     */
    String INPUT = "myInput";

    /**
     * 输出消息channel
     */
    String OUTPUT = "myOutput";


    /**
     * 接受消息
     * @return
     */
    @Input(INPUT)
    SubscribableChannel input();

    /**
     * 发送消息
     *
     * 完成了消息通道绑定的定义后，这些用于定义绑定消息通道的接口则
     * 可以被 @EnableBinding 注解的 value 参数指定，
     * 从而在应用启动的时候实现对定义消息通道的绑定
     *
     * @return
     */
    @Output(OUTPUT)
    MessageChannel output();
}
