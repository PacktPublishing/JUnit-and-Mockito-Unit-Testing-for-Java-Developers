package com.javaeasily.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @PostConstruct
    public void init() throws Exception {
        repository.loadStaticData();
    }

    @PreDestroy
    public void dispose() throws Exception {
        System.out.println("Destroying service bean.");
    }

}
