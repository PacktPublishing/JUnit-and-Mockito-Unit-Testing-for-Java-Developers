package com.javaeasily.demos.mockito.myapp;

public class AuthenticationService {

    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user.getPassword().equals(password);
    }
}
