package com.mystudy.producer.controller;

import com.mystudy.producer.entity.Student;
import com.mystudy.producer.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2021-08-11 下午 05:26
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/")
public class MybatisController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/getstu")
    public Object get() {
        return studentMapper.selectById(1);
    }

    @PostMapping("/setstu")
    @Transactional(rollbackFor = Exception.class)
    public void set() {
        Student student = new Student();
        student.setId(2222);
        student.setName("mappe22r");
        student.setNo("222");
        studentMapper.insert(student);
        sout();
    }

    private void sout() {
        System.out.println("进入sout()");
        if( TransactionSynchronizationManager.isSynchronizationActive()){
            //事务提交后发送部门消息
            TransactionSynchronizationManager.registerSynchronization(
                    new TransactionSynchronizationAdapter(){
                        @Override
                        public void afterCommit() {
                            System.out.println("事务提交后执行");

                            //dosomething（）

                        }
                    });
        }
    }
}
