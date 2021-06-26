package com.mystudy.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ：songdalin
 * @date ：2021-06-26 上午 10:38
 * @description：
 * @modified By：
 * @version: 1.0
 */
@FeignClient(value = "nacos-tsst2", path = "/")
public interface TestClient {

    @RequestMapping(value = "/getstr", method = RequestMethod.GET)
    String getStr(String a);

}
