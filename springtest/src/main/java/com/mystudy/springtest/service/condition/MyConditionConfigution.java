package com.mystudy.springtest.service.condition;

import com.mystudy.springtest.service.CommonService;
import com.mystudy.springtest.service.impl.CommonServiceImpl;
import com.mystudy.springtest.service.impl2.CommonServiceImpl2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：songdalin
 * @date ：2021-06-11 下午 02:15
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class MyConditionConfigution {

    /**
     * @confitionalonproperty注解使用
     * 配和配置文件
     * 自定义多实现注入
     * @return
     */
    @Bean
    @ConditionalOnProperty(prefix = "airport", name = "name", havingValue = "tgo")
    public CommonService commonService () {
        return new CommonServiceImpl();
    }

    @Bean
    @ConditionalOnProperty(prefix = "airport", name = "name", havingValue = "cif")
    public CommonService commonService2 () {
        return new CommonServiceImpl2();
    }
}
