package com.example.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeLoggingAspect {

    @After("execution(void MyService.doSomething(..))")
    public void intercept() {
        System.out.println("Intercepted!");
    }

}
