package com.mystudy.springtest;

import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-06-29 下午 08:18
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class Study {

    public Integer getAge() {
        this.age = 5;
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;
}
