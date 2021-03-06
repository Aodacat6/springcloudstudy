package com.mystudy.usermanage.controller;

import org.springframework.security.access.annotation.Secured;
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
@RequestMapping("/test")
public class TestController {

    //注解表示需要的权限
    @Secured({"ROLE_admins"})
    @GetMapping("/hello")
    public String test() {
        return "success";
    }


    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
