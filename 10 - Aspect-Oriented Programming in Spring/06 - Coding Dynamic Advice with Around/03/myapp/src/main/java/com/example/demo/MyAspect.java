package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyAspect {

    @Around("execution(void MyService.*(..))")
    public void intercept(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Intercepted! " + Arrays.toString(joinPoint.getArgs()));
        Object[] args = joinPoint.getArgs();
        int actualValue = Integer.parseInt(args[0].toString());
        if (actualValue == 42) {
            joinPoint.proceed();
        } else {
            System.out.println("Ignoring.");
        }
    }

}
