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
        joinPoint.proceed();  // @Before equivalent
        System.out.println("Intercepted! " + Arrays.toString(joinPoint.getArgs()));
        // joinPoint.proceed();  // @After equivalent if proceed is only here
    }

}
