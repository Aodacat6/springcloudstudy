package com.mystudy.basedata.controller;

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
@RequestMapping
public class BasedataController {

    @GetMapping("/test")
    public String test () {
        return "success";
    }
}
