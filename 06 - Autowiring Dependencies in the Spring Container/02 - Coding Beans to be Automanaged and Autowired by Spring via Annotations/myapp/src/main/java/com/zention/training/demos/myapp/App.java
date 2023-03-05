package com.zention.training.demos.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(("application-context.xml"));

        MyService service = ctx.getBean(MyService.class);
        service.doBusinessLogic();

        MyRepository repository = ctx.getBean(MyRepository.class);
        repository.doQuery();
    }

}