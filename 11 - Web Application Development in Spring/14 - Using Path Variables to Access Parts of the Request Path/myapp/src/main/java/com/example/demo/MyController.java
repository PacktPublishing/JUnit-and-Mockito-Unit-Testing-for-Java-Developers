package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

    public MyController() {
        System.out.println("Creating controller!");
    }

    @GetMapping(path = "/greeting/{aParam}")
    public ModelAndView doGreeting(@PathVariable("aParam") String param, @RequestParam String mode) {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", param);
        values.put("moodComment", "happy".equals(mode) ? "Feelin' good! ;)" : "Could be better...");

        ModelAndView modelAndView = new ModelAndView("greet", values);
        return modelAndView;
    }

}
