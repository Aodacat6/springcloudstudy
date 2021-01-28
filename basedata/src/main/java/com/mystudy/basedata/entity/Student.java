package com.mystudy.basedata.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author ：songdalin
 * @date ：2021-01-28 下午 03:10
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
@Accessors(chain = true)
public class Student {

    private Integer id;

    private String name;
}
