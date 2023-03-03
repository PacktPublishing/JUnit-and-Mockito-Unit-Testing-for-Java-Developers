package com.javaeasily.demos.mockito.myapp;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<String, User>();

    public UserRepository() {
        users.put("matt", new User("matt", "letmein"));
        users.put("frank", new User("frank", "myPassword"));
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}
