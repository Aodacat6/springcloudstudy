package com.mystudy.springtest;

import com.mystudy.springtest.service.EnvironmentTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTML;

/**
 * @author ：songdalin
 * @date ：2021-03-30 上午 09:37
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping
public class MyController {

    @Autowired
    public void setEnvironmentTest(EnvironmentTest environmentTest) {
        this.environmentTest = environmentTest;
    }

    private EnvironmentTest environmentTest;

/*    @Autowired
    public MyController(EnvironmentTest environmentTest){
        this.environmentTest = environmentTest;
    }*/




    @GetMapping("/test")
    public String hello() throws Exception {

        return environmentTest.getName();
    }
}
