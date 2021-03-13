package com.mystudy.netty;

import com.mystudy.netty.nettyserver.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetSocketAddress;

/**
 * @author ：songdalin
 * @date ：2021-02-09 下午 05:11
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
public class NettyApplication {

    public static void main(String[] args){
        SpringApplication.run(NettyApplication.class, args);

        //启动服务端
        NettyServer nettyServer = new NettyServer();
        nettyServer.start(new InetSocketAddress("127.0.0.1", 8090));
    }
}
