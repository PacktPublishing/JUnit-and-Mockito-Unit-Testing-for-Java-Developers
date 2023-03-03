package com.javaeasily.demos.mockito.myapp;

public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        return "abracadabra".equals(password);
    }
}
