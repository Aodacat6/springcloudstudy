package com.mystudy.basedata.controller;

import com.mystudy.Dtos.basedata.StudentDto;
import com.mystudy.basedata.service.impl.StudentServiceImpl;
import com.sun.corba.se.impl.javax.rmi.CORBA.StubDelegateImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 02:48
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/basedata")
public class BasedataController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/test")
    public String test () {
        return "success";
    }

    @GetMapping("/get")
    public StudentDto get() {
        return studentService.test();
    }

    @GetMapping("/balance")
    public String testBalance() {
        return "==============:" + port;
    }
}
