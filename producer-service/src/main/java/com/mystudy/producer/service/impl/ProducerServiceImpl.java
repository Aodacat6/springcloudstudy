package com.mystudy.producer.service.impl;

import com.mystudy.Dtos.basedata.StudentDto;
import com.mystudy.producer.client.BasedataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 04:08
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class ProducerServiceImpl {

    @Autowired
    private BasedataClient basedataClient;

    //@Autowired
    @Resource
    private RestTemplate restTemplate;

    public StudentDto test() {
        return basedataClient.get();
    }

    public String testRest() {
        //ribbon请求，绑定servername即可
        return restTemplate.getForObject("http://basedata/basedata/balance", String.class);
    }

}
