package com.mystudy.other.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：songdalin
 * @date ：2021-03-13 下午 01:19
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class Student {

    @Autowired
    private Teacher teacher;

/*    public Student(Teacher teacher) {
        System.out.println("Student->teacher:" + teacher);
    }*/

    public Student() {
        /**
         * 1、类实例化时，没有将循环依赖的属性注入
         */
        System.out.println("Student->teacher:" + teacher);
    }

    public void learn() {
        /**
         * 2、类初始化时，再将依赖的属性注入
         */
        System.out.println("Student->" + teacher.getAge());
        System.out.println("learning.....");
    }

}
