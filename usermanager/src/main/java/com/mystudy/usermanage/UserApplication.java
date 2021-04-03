package com.mystudy.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：songdalin
 * @date ：2021-04-03 下午 02:05
 * @description：
 * @modified By：
 * @version: 1.0
 */

/**
 * security添加依赖后就需要登录验证了
 * 默认用户名  user
 * 默认密码，项目启动时打印 Using generated security password: 807e637a-98cc-443e-9a63-8c81b79764ad
 *
 * Spring security本质上是一个过滤器链
 *
 * 两个重要的接口
 *    1、 UserDetailsService   查询数据库用户密码
 *    2、 PasswordEncoder      密码加密，用户返回User对象中密码的加密
 *
 * 开发步骤
 *   1、创建一个类继承UsernamePasswordAuthenticationFilter,重写三个方法
 *   2、实现UserDetailsService，编写查询数据库过程，返回security提供的User对象
 *
 * 认证的三种方式：
 *          1、配置文件
 *          2、配置类
 *          3、自定义配置
 *
 *
 */
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args){
        SpringApplication.run(UserApplication.class, args);
    }
}
