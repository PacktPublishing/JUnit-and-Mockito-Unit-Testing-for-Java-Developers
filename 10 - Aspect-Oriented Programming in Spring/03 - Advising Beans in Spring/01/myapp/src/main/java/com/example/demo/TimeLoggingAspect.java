package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeLoggingAspect {

    @Before("execution(void MyService.doSomething(..))")
    public void intercept() {
        System.out.println("Intercepted!");
    }

}
