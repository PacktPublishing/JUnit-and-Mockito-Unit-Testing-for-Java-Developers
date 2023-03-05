package com.zention.training.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext(("application-context.xml"));
        MyService bean = ctx.getBean(MyService.class);
        bean.doSomething();
    }

}