package com.ara.aspct;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class KeyCheckAspect {
        @AfterReturning(value = "target(com.ara.bean.KeyGenerator)", returning = "Key")
        public void check(JoinPoint jp, Object Key) {
            if ((Integer) Key <= 0) {
                throw new IllegalArgumentException("invalid len");
            }
        }
    }





