package com.mystudy.usermanage.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：songdalin
 * @date ：2021-04-05 上午 09:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    /**
     * 方法三：  自定义用户名密码
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //	public User(String username, String password,
        //			Collection<? extends GrantedAuthority> authorities)
        List<GrantedAuthority> list =
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
        return new User("tom", new BCryptPasswordEncoder().encode("123"), list);
    }

}
