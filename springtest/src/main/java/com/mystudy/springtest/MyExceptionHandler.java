package com.mystudy.springtest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ：songdalin
 * @date ：2021-03-30 上午 09:36
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestControllerAdvice
public class MyExceptionHandler {

    //必须加这两个
    //一个是捕获异常
    //一个是返回异常状态码，否则200
    @ExceptionHandler
    @ResponseStatus
    public String myException(Exception e) {
        return "myerroe";
    }
}
