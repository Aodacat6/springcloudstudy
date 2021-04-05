package com.mystudy.usermanage.service;

import com.mystudy.usermanage.entity.SysUser;
import com.mystudy.usermanage.repository.SysUserRepostory;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.util.Optional;

/**
 * @author ：songdalin
 * @date ：2021-04-05 上午 09:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserRepostory sysUserRepostory;

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
        //List<SysUser> sysUsers = sysUserRepostory.findAll();
        Optional<SysUser> optional = sysUserRepostory.findByLoginName(username);
        if (!optional.isPresent()) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        SysUser sysUser = optional.get();

        //设置用户角色权限
//        List<GrantedAuthority> list =
//                AuthorityUtils.commaSeparatedStringToAuthorityList("admins");
        //角色设置，需要加  ROLE_
        List<GrantedAuthority> list =
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_admins,ROLE_user");
        return new User(sysUser.getLoginName(), new BCryptPasswordEncoder().encode(sysUser.getPassword()), list);
    }

}
