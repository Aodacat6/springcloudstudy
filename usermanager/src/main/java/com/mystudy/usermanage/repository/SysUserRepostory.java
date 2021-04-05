package com.mystudy.usermanage.repository;

import com.mystudy.usermanage.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author ：songdalin
 * @date ：2021-04-05 上午 10:00
 * @description：
 * @modified By：
 * @version: 1.0
 */
public interface SysUserRepostory extends JpaRepository<SysUser, String> {

    Optional<SysUser> findByLoginName(String loginName);

}
