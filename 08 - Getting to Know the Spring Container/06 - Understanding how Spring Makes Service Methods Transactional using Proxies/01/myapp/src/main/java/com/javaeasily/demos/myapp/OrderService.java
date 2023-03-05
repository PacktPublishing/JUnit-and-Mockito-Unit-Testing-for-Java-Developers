package com.javaeasily.demos.myapp;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void placeOrder() {
        // suppose it places an order for something...
        System.out.println("Placing order...");
    }

}
