package com.mystudy.springtest;

import com.mystudy.springtest.aware.SomeAwareInterfaceTest;
import com.mystudy.springtest.bean.Bean;
import com.mystudy.springtest.properties.MyAddress;
import com.mystudy.springtest.service.EnvironmentTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTML;

/**
 * @author ：songdalin
 * @date ：2021-03-30 上午 09:37
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping
public class MyController implements BeanNameAware, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private MyAddress myAddress;

  /*  @Autowired
    private Bean bean;*/

/*    @Autowired
    public void setEnvironmentTest(EnvironmentTest environmentTest) {
        this.environmentTest = environmentTest;
    }

    private EnvironmentTest environmentTest;*/

/*    @Autowired
    public MyController(EnvironmentTest environmentTest){
        this.environmentTest = environmentTest;
    }*/




    @GetMapping("/test")
    public String hello() throws Exception {

       // return environmentTest.getName();
      /*  EnvironmentTest test =  (EnvironmentTest)SomeAwareInterfaceTest.getByName("environmenttest");
        return test.getName();*/
        //MyAddress myAddress = SomeAwareInterfaceTest.getByName("myAddress");
        //return myAddress.toString();
        System.out.println(applicationContext.getBean(Bean.class).getTime());
        return "succ";

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean名字是：" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("设置spring上下文");
        this.applicationContext = applicationContext;
    }
}
