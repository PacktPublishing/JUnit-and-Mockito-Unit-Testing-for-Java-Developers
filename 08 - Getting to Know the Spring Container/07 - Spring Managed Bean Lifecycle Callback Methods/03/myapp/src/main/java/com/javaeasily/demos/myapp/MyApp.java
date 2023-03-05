package com.javaeasily.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.javaeasily.demos.myapp");
        ((AbstractApplicationContext) ctx).close();
    }

}
