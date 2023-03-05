package com.zention.training.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyRepository repository;

    public void doBusinessLogic() {
        System.out.println("Doing business logic!");
        repository.doQuery();
    }

}
