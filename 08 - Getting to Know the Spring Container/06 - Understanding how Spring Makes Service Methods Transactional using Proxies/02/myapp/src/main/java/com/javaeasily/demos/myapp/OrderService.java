package com.javaeasily.demos.myapp;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Transactional
    public void placeOrder() {
        // suppose it places an order for something...
        System.out.println("Placing order...");
    }

}
