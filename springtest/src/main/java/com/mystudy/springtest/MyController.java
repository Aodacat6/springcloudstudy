package com.mystudy.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/test")
    public String hello() throws Exception {
        if (1 ==1) {
            throw new Exception("dd");
        }
        return "return success";
    }
}
