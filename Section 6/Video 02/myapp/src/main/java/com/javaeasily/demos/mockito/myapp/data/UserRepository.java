package com.javaeasily.demos.mockito.myapp.data;

import com.javaeasily.demos.mockito.myapp.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<String, User>();

    public UserRepository() {
        // regular users
        users.put("matt", User.createRegularUser("matt", "letmein"));
        users.put("frank", User.createRegularUser("frank", "myPassword"));
        users.put("suzie", User.createRegularUser("suzie", "abracadabra"));

        // admin users
        users.put("thomas", User.createRegularUser("thmas", "tommy"));
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}
