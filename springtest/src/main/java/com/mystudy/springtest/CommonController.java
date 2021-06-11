package com.mystudy.springtest;

import com.mystudy.springtest.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：songdalin
 * @date ：2021-06-11 下午 01:53
 * @description：通用控制器，对应通用service
 * @modified By：
 * @version: 1.0
 */
@RequestMapping("/")
@RestController
public class CommonController {

    @Autowired
    //@Resource(name = "commonServiceImpl2")
    private CommonService commonService;

    @GetMapping("/get/{str}")
    public String getStr(@PathVariable("str") String str) {
        return commonService.getString(str);
    }
}
