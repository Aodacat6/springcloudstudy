package com.mystudy.basedata.service.impl;

import com.mystudy.Dtos.basedata.StudentDto;
import com.mystudy.basedata.entity.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 03:20
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class StudentServiceImpl {

    public StudentDto test() {
        Student student = new Student();
        student.setId(1).setName("ming");

        StudentDto studentDto = new StudentDto();
        BeanUtils.copyProperties(student, studentDto);
        return studentDto;
    }
}
