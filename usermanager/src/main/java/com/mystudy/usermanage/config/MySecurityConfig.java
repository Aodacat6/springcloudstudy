package com.mystudy.usermanage.config;

import com.mystudy.usermanage.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

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

    @Autowired
    private DataSource dataSource;

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        jdbcTokenRepository.setDataSource(dataSource);
        return jdbcTokenRepository;
    }

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
        //退出操作
        http.logout().logoutUrl("/logout")
                .logoutSuccessUrl("/test/hello").permitAll();

        //配置403界面
        http.exceptionHandling().accessDeniedPage("/unauth.html");

        http.formLogin()
                .loginPage("/login.html")           //自定义登录页
                .loginProcessingUrl("/user/login")  //登录页动作
                .defaultSuccessUrl("/success.html").permitAll()  //登录成功后跳转
                .and()                  //bulider模式，返回对象本身
                .authorizeRequests()
                .antMatchers("/", "/test/hello", "/user/login").permitAll()  //设置白名单
                .antMatchers("/test/index")
                //设置需要的权限 (单指一个权限)
                //.hasAuthority("admins")
                //.hasAnyAuthority("admins,user")
                //根据角色区分权限
                //.hasRole("admins")
                .hasAnyRole("admins,user")
                .anyRequest().authenticated()  //除了白名单，都需要验证
                .and().rememberMe().tokenRepository(persistentTokenRepository())  //开启rememberme，设置tokenrepository
                .tokenValiditySeconds(60)  //token有效期
                .userDetailsService(userDetailsService)  //rememberme用
                .and()
                .csrf().disable();
    }


}
