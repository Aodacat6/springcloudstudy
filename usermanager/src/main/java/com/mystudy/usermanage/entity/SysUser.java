package com.mystudy.usermanage.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ：songdalin
 * @date ：2021-04-05 上午 09:55
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
@Entity
@Table(name = "sys_user")
public class SysUser {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "login_name")
    private String loginName;

    @Column(name = "password")
    private String password;
}
