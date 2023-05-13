package com.ara.test;

import com.ara.bean.KeyGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ARATest {
    public static void main(String[] args) {
         ApplicationContext context = new AnnotationConfigApplicationContext(KeyGenerator.class);
         KeyGenerator kg = context.getBean(KeyGenerator.class);
         int key = kg.generateKey(5);
         System.out.println("Key:"+ key);

    }
}
