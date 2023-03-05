package com.zention.training.demos.myapp;

import org.springframework.context.annotation.*;

@Profile("local")
@Configuration
@ComponentScan("com.zention.training.demos.myapp")
@PropertySource("classpath:application-local.properties")
public class AppConfig {

}
