package com.zention.training.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyService implements EnvironmentAware {

    private MyRepository repository;

    private Environment environment;

    @Autowired
    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public void doBusinessLogic() {
        System.out.println("Doing business logic!");
        System.out.println("Active profiles: " + Arrays.toString(this.environment.getActiveProfiles()));
        repository.doQuery();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

}
