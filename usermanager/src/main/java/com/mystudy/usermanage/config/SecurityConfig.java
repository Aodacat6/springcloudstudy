package com.mystudy.usermanage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
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
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * security 配置登录用户方法二：  配置类
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**
         * 实现加密类
         * security的密码必须以加密的方式存储
         */
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pass = encoder.encode("123");
        auth.inMemoryAuthentication().withUser("damiao").password(pass).roles("admin");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
