package com.mystudy.other.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：songdalin
 * @date ：2021-03-13 下午 01:20
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class Teacher {

    @Autowired
    private Student student;

    public Integer getAge() {
        return age;
    }

    private Integer age = 5;

    public Teacher(Student student) {
        System.out.println("Teacher->student:" + student);
    }

    public void teach() {
        System.out.println("teaching......");
        student.learn();
    }
}
