package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;

import java.util.Set;
import java.util.stream.Collectors;

public class AuthenticationService {

    private UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user.getPassword().equals(password);
    }

    public Set<User> getRegularUsers() {
        return getUsersByUserType(User.UserType.REGULAR_USER);
    }

    public Set<User> getAdminUsers() {
        return getUsersByUserType(User.UserType.ADMIN_USER);
    }

    private Set<User> getUsersByUserType(User.UserType userType) {
        return userRepository.findAll()
                .stream()
                .filter(user -> user.isLive() && user.getUserType() == userType )
                .collect(Collectors.toSet());
    }
}
