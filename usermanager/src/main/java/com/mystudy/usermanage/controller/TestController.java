package com.mystudy.usermanage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2021-04-03 下午 02:07
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
