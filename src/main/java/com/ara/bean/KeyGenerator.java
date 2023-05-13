package com.ara.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.ara.aspct", "com.ara.bean"})

public class KeyGenerator {

    public int generateKey(int len) {
        if (len > 8) {
            return 0;
        }
        return 1;

    }

}

