package com.javaeasily.demos.myapp;

import org.springframework.context.support.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.javaeasily.demos.myapp");
    }

}
