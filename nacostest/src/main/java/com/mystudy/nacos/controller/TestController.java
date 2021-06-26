package com.mystudy.nacos.controller;

import com.mystudy.nacos.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2021-06-26 上午 10:37
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/nacos")
public class TestController {

    @Autowired
    private TestClient testClient;

    @GetMapping("/test")
    public String getString() {
        return testClient.getStr("nacos");
    }
}
