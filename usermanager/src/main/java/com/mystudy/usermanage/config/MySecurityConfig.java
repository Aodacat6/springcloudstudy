package com.mystudy.usermanage.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author ：songdalin
 * @date ：2021-04-03 下午 06:37
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * security 配置登录用户方法三：  自定义实现方法
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**
         * 实现加密类
         * security的密码必须以加密的方式存储
         */

        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /**
     * 登录设置
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/login.html")           //自定义登录页
                .loginProcessingUrl("/user/login")  //登录页动作
                .defaultSuccessUrl("/test/index").permitAll()  //登录成功后跳转
                .and()                  //bulider模式，返回对象本身
                .authorizeRequests()
                .antMatchers("/", "/test/hello", "/user/login").permitAll()  //设置白名单
                .anyRequest().authenticated()  //除了白名单，都需要验证
                .and()
                .csrf().disable();
    }


}
