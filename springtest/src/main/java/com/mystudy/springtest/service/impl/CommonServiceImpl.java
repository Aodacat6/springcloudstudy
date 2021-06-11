package com.mystudy.springtest.service.impl;

import com.mystudy.springtest.service.CommonService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * @author ：songdalin
 * @date ：2021-06-11 下午 02:00
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class CommonServiceImpl implements CommonService {

    @Override
    public String getString(String str) {
        return str;
    }
}
