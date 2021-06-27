package com.mystudy.nacos2.interceptor;


import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：songdalin
 * @date ：2021-06-27 下午 08:31
 * @description：拦截器测试
 * @modified By：
 * @version: 1.0
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

    Map<String, Integer> count = new HashMap<>();

    /**
     * This implementation always returns {@code true}.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (count.containsKey(request.getRequestURI())) {
            count.put(request.getRequestURI(), 1 + count.get(request.getRequestURI()));
        }else {
            count.put(request.getRequestURI(), 1);
        }

        System.out.println("进入" + "preHandle");
        return true;
    }

    /**
     * This implementation is empty.
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("进入" + "postHandle");
    }

    /**
     * This implementation is empty.
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {
        System.out.println("进入" + "afterCompletion");
        System.out.println("接口：" + request.getRequestURI() + "访问次数： " + count.get(request.getRequestURI()));
    }


}
