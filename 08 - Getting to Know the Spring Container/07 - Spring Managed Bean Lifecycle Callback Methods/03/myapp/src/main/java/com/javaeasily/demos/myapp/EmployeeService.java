package com.javaeasily.demos.myapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements InitializingBean, DisposableBean {

    @Autowired
    private EmployeeRepository repository;

    public void afterPropertiesSet() throws Exception {
        repository.loadStaticData();
    }

    public void destroy() throws Exception {
        System.out.println("Destroying service bean");
    }

}
