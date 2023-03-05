package com.zention.training.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Value("${my.name:Joe Bloggs}")
    private String name;

    @Autowired
    private MyRepository repository;

    public void doBusinessLogic() {
        System.out.println("Doing business logic for " + name);
        repository.doQuery();
    }

}
