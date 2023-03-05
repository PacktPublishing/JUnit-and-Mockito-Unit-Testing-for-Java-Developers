package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyAspect {

    @Around("execution(void MyService.*(..))")
    public void intercept(JoinPoint joinPoint) {
        System.out.println("Intercepted! " + Arrays.toString(joinPoint.getArgs()));
    }

}
