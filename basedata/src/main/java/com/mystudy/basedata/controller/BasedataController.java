package com.mystudy.basedata.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystudy.Dtos.basedata.DispatchTaskFlightVo;
import com.mystudy.Dtos.basedata.StudentDto;
import com.mystudy.basedata.service.impl.StudentServiceImpl;
import com.sun.corba.se.impl.javax.rmi.CORBA.StubDelegateImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 02:48
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/basedata")
public class BasedataController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/test")
    public String test () {
        return "success";
    }

    @GetMapping("/get")
    public StudentDto get() {
        return studentService.test();
    }

    @GetMapping("/balance")
    public String testBalance() {
        log.info("=====trace======");
        return "==============:" + port;
    }

    @GetMapping("/getjson")
    public List<DispatchTaskFlightVo> getjson() throws IOException {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String path = "dispatch.json";
        try {
            br = new BufferedReader(new InputStreamReader(BasedataController.class.getClassLoader().getResourceAsStream(path)));
            String line = br.readLine();

            while (line != null) {
                sb.append(line + "\r\n");
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(sb.toString(), new TypeReference<List<DispatchTaskFlightVo>>() {});
    }
}
