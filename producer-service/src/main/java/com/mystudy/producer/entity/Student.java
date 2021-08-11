package com.mystudy.producer.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author ：songdalin
 * @date ：2021-08-11 下午 05:23
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
@TableName("student")
public class Student {

    private Integer id;
    private String name;
    private String no;
}
