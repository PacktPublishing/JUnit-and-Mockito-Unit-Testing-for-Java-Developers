package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserLookupServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserLookupService userLookupService;

    @Test
    public void getRegularUsers() {
        // arrange
        List<User> userList = new LinkedList<>();
        userList.add(User.createRegularUser("anne", "abc123"));
        userList.add(User.createRegularUser("donald", "dbc321"));
        userList.add(User.createAdminUser("beebop", "pwd098"));

        when(userRepository.findAll()).thenReturn(userList);

        // act
        Set<User> actualUsers = userLookupService.getRegularUsers();

        // assert
    }

    @Test
    public void getAdminUsers() {
        // arrange

        // act

        // assert
    }
}