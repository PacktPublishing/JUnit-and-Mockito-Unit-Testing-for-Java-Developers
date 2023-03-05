package com.javaeasily.demos.myapp;

public class Proxy implements Person {
    private Person delegate;

    public Proxy(Person delegate) {
        this.delegate = delegate;
    }

    public void greet() {
        System.out.println("I just wanna say...");
        delegate.greet();
    }

}
