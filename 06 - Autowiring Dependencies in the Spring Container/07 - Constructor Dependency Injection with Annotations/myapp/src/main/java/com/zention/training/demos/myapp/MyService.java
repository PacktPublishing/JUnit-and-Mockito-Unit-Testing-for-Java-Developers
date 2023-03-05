package com.zention.training.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyRepository repository;

    @Autowired
    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void doBusinessLogic() {
        System.out.println("Doing business logic!");
        repository.doQuery();
    }

}
