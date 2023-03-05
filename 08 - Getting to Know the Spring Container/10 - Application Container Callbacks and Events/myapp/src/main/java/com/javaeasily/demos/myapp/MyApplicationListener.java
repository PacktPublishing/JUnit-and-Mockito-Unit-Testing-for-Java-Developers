package com.javaeasily.demos.myapp;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Application event received: " + event.toString());
    }

}
