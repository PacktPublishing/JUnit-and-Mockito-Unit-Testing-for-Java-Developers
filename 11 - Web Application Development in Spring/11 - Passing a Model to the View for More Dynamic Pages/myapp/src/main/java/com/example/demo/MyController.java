package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

    public MyController() {
        System.out.println("Creating controller!");
    }

    @GetMapping(path = "/greeting")
    public ModelAndView doGreeting() {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Matt");

        ModelAndView modelAndView = new ModelAndView("greet", values);
        return modelAndView;
    }

}
