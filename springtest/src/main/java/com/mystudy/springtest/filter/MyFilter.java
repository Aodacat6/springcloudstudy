package com.mystudy.springtest.filter;

import com.mystudy.springtest.Study;
import com.mystudy.springtest.aware.SomeAwareInterfaceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.security.sasl.AuthenticationException;
import javax.servlet.*;
import java.io.IOException;

/**
 * @author ：songdalin
 * @date ：2021-06-29 下午 06:20
 * @description：自定义过滤器
 * @modified By：
 * @version: 1.0
 */
//@Component
//配合自定义配置注入方法，可以实现不用component
public class MyFilter implements Filter {

/*
    @Autowired
    private Study study;
*/

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //int age = study.getAge();
        System.out.println("====init=====================");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //int age = study.getAge();
        byte[] bytes = new byte[1024];
        request.getInputStream().readLine(bytes, 0 , 1024);
        System.out.println("input==" + new String(bytes));
/*        if (null  == request.getAttribute("cookies")) {
            throw new AuthenticationException("no cookie");
        }*/
        System.out.println("====doFilter==================");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("====destroy======================");

    }
}
