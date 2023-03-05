package com.javaeasily.demos.myapp;

import org.springframework.aop.framework.ProxyFactoryBean;

public class MyApp {

    public static void main(String[] args) {
        IPerson p = new Person();

        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        proxyFactory.setTarget(p);
        Object proxy = proxyFactory.getObject();

        IPerson bean = (IPerson) proxy;
        bean.greet();
    }

}
