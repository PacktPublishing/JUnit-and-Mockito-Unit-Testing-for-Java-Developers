package com.javaeasily.demos.myapp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class TimestampLoggingProxy implements InvocationHandler {

    private Object delegate;

    private TimestampLoggingProxy(Object delegate) {
        this.delegate = delegate;
    }

    public static Object getProxyFor(Object o) {
        return Proxy.newProxyInstance(
                o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),
                new TimestampLoggingProxy(o)
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(new Date());
        return method.invoke(delegate, args);
    }

}
