package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void doSomething(int number) {
        System.out.println("Doing business method... Number is: " + number);
    }

}
