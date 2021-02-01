package com.mystudy.producer.service.impl;

import com.mystudy.Dtos.basedata.StudentDto;
import com.mystudy.producer.client.BasedataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public StudentDto test() {
        return basedataClient.get();
    }

}
