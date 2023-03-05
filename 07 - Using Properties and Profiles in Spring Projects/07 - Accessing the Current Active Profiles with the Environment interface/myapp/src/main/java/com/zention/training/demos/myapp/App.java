package com.zention.training.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService service = ctx.getBean(MyService.class);
        service.doBusinessLogic();
    }

}