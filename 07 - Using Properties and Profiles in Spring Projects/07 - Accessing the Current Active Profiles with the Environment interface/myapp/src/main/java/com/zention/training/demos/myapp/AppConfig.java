package com.zention.training.demos.myapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zention.training.demos.myapp")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
