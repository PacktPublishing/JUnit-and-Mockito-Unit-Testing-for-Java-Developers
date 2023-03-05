package com.javaeasily.demos.myapp;

public class MyApp {

    public static void main(String[] args) {
        Person p = new Proxy(new PersonImpl());
        p.greet();
    }

}
