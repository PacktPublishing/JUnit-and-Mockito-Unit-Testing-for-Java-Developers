package com.javaeasily.demos.myapp;

public class MyApp {

    public static void main(String[] args) throws InterruptedException {
        Person p = (Person) TimestampLoggingProxy.getProxyFor(new PersonImpl());
        p.greet();
        Thread.sleep(1000);
        p.greet();
        p.greet();
    }

}
