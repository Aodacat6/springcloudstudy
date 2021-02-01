package com.mystudy.producer.client;

import com.mystudy.Dtos.basedata.StudentDto;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-02-01 下午 05:06
 * @description：hystrix熔断
 * @modified By：
 * @version: 1.0
 */
@Component
public class BasedataClientFallback implements BasedataClient {

    public StudentDto get() {
        StudentDto dto = new StudentDto();
        dto.setId(1);
        dto.setName("basedata server is error, this is fallback");
        return dto;
    }
}
