package com.javaeasily.demos.myapp;

import org.springframework.aop.framework.ProxyFactoryBean;

public class MyApp {

    public static void main(String[] args) {
        Person p = new Person();

        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        proxyFactory.setTarget(p);
        Object proxy = proxyFactory.getObject();

        Person bean = (Person) proxy;
        bean.greet();
    }

}
