package com.mystudy.producer.controller;

import com.mystudy.Dtos.basedata.StudentDto;
import com.mystudy.producer.service.impl.ProducerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 04:03
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private ProducerServiceImpl producerService;

    @GetMapping("/get")
    public StudentDto get() {
        return producerService.test();
    }

    @GetMapping("/getrest")
    public StudentDto getrest() {
        return producerService.testRest();
    }


}
