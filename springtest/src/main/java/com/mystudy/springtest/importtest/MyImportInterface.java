package com.mystudy.springtest.importtest;

import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author ：songdalin
 * @date ：2021-06-30 下午 09:11
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Component
public class MyImportInterface implements ImportAware {
    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        System.out.println();
    }
}
