package com.mystudy.producer;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：songdalin
 * @date ：2021-02-07 下午 06:34
 * @description：
 * @modified By：
 * @version: 1.0
 */

public class MyRibbonRule extends AbstractLoadBalancerRule {

    private AtomicInteger nextServerCyclicCounter;
    private static final boolean AVAILABLE_ONLY_SERVERS = true;
    private static final boolean ALL_SERVERS = false;

    //同一个server调用次数
    private int i = 0;
    //上一次调用的server
    private int lastServer = 0;

    private static Logger log = LoggerFactory.getLogger(RoundRobinRule.class);

    public MyRibbonRule() {
        nextServerCyclicCounter = new AtomicInteger(0);
    }

    public MyRibbonRule(ILoadBalancer lb) {
        this();
        setLoadBalancer(lb);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            log.warn("no load balancer");
            return null;
        }

        Server server = null;
        int count = 0;
        while (server == null && count++ < 10) {
            List<Server> reachableServers = lb.getReachableServers();
            List<Server> allServers = lb.getAllServers();
            int upCount = reachableServers.size();
            int serverCount = allServers.size();

            if ((upCount == 0) || (serverCount == 0)) {
                log.warn("No up servers available from load balancer: " + lb);
                return null;
            }

            /**
             * 自定义选择器
             */
            //初始
            if (i < 5) {
                i++;
            }else {
                if (lastServer < serverCount-1) {
                    lastServer++;
                }else {
                    lastServer = 0;
                }
                i = 1;
            }


            server = allServers.get(lastServer);

            if (server == null) {
                /* Transient. */
                Thread.yield();
                continue;
            }

            if (server.isAlive() && (server.isReadyToServe())) {
                return (server);
            }

            // Next.
            server = null;
        }

        if (count >= 10) {
            log.warn("No available alive servers after 10 tries from load balancer: "
                    + lb);
        }
        return server;
    }


    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
