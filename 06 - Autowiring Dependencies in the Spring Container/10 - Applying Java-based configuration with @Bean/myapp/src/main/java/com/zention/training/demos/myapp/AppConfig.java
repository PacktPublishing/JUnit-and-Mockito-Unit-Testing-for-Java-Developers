package com.zention.training.demos.myapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService getService() {
        return new MyService(getRepository());
    }

    @Bean
    public MyRepository getRepository() {
        return new MyRepository();
    }

}
