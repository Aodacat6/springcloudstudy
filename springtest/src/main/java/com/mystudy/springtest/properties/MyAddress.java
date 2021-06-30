package com.mystudy.springtest.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-06-30 下午 10:02
 * @description：
 * @modified By：
 * @version: 1.0
 */
//@Component
@ConfigurationProperties(prefix = "myaddress")
public class MyAddress {

    private String sheng;
    private String shi;
    private String qu;

    public MyAddress() {
    }

    public MyAddress(String sheng, String shi, String qu) {
        this.sheng = sheng;
        this.shi = shi;
        this.qu = qu;
    }

    @Override
    public String toString() {
        return "MyAddress{" +
                "sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                ", qu='" + qu + '\'' +
                '}';
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }
}
