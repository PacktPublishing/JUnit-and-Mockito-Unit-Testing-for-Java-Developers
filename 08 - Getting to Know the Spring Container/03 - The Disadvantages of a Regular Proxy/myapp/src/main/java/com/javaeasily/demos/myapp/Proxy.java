package com.javaeasily.demos.myapp;

public class Proxy implements Person {
    private Person delegate;

    public Proxy(Person delegate) {
        this.delegate = delegate;
    }

    public void greet() {
        intercept();
    }

    public void greetInFrench() {
        intercept();
    }

    private void intercept() {
        System.out.println("I just want to say...");
        delegate.greet();
    }
}
