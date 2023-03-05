package com.zention.training.demos.myapp;

import com.zention.training.demos.myapp.config.DevelopmentConfig;
import com.zention.training.demos.myapp.config.ProductionConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(DevelopmentConfig.class, ProductionConfig.class);

        MyService service = ctx.getBean(MyService.class);
        service.doBusinessLogic();
    }

}