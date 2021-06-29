package com.mystudy.springtest.config;

import com.mystudy.springtest.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：songdalin
 * @date ：2021-06-29 下午 09:04
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<MyFilter> myFilter() {
        FilterRegistrationBean<MyFilter> myFilter = new FilterRegistrationBean<>();
        MyFilter myFilter1 = new MyFilter();
        myFilter.setFilter(myFilter1);
        return myFilter;
    }
}
