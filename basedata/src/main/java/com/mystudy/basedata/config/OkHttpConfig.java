package com.mystudy.basedata.config;

import feign.Feign;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author ：songdalin
 * @date ：2020/9/14 下午 03:22
 * @description：okhttp配置
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@Configuration
@ConditionalOnClass(Feign.class)
@AutoConfigureBefore(FeignAutoConfiguration.class)
public class OkHttpConfig {

    @Value("${okhttp.connect-timeout}")
    private transient int connectTimeout;

    @Value("${okhttp.read-timeout}")
    private transient int readTimeout;

    @Value("${okhttp.write-timeout}")
    private transient int writeTimeout;

    @Value("${okhttp.retry-on-connection-failure}")
    private transient boolean retryOnConnectionFailure;

    @Value("${okhttp.maxIdleConnections}")
    private transient int maxIdleConnections;

    @Value("${okhttp.keepAliveDuration}")
    private transient int keepAliveDuration;

    @Bean
    public OkHttpClient okHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                .readTimeout(readTimeout, TimeUnit.SECONDS)
                .writeTimeout(writeTimeout, TimeUnit.SECONDS)
                .retryOnConnectionFailure(retryOnConnectionFailure)
                .connectionPool(new ConnectionPool(maxIdleConnections , keepAliveDuration, TimeUnit.MINUTES))
/*                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        log.info("okhttp:");
                        return chain.proceed(chain.request());
                    }
                })*/
                .build();
    }
}
