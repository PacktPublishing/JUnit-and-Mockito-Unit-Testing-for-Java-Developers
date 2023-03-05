package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    public MyController() {
        System.out.println("Creating controller!");
    }

    @GetMapping(path = "/greeting")
    public String doGreeting() {
        return "greet";
    }

}
