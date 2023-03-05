package com.javaeasily.demos.myapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements ApplicationContextAware {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Here's the app context: " + applicationContext);
    }
}
