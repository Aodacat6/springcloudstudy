package com.mystudy.producer.client;

import com.mystudy.Dtos.basedata.DispatchTaskFlightVo;
import com.mystudy.Dtos.basedata.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 04:10
 * @description：
 * @modified By：
 * @version: 1.0
 */
@FeignClient(name = "basedata", path = "/basedata", fallback = BasedataClientFallback.class)
public interface BasedataClient {

    @GetMapping("/get")
    StudentDto get();

    @GetMapping("/getjson")
    List<DispatchTaskFlightVo> getjson() ;
}
