package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserLookupServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserLookupService userLookupService;

    @Test
    public void getRegularUsers_junit() {
        // arrange
        List<User> userList = new LinkedList<>();
        userList.add(User.createRegularUser("anne", "abc123"));
        userList.add(User.createRegularUser("donald", "dbc321"));
        userList.add(User.createAdminUser("beebop", "pwd098"));

        when(userRepository.findAll()).thenReturn(userList);

        // act
        Set<User> actualUsers = userLookupService.getRegularUsers();

        // assert
        assertNotNull(actualUsers);
        assertEquals(actualUsers.size(), 2);

//        // check user 1
//        User actualUser1 = userList.get(0);
//        assertNotNull(actualUser1);
//        assertEquals(actualUser1.getUserType(), User.UserType.REGULAR_USER);
//        assertEquals(actualUser1.getUsername(), "anne");
//        assertEquals(actualUser1.getPassword(), "abc123");
//
//        // check user 2
//        User actualUser2 = userList.get(0);
//        assertNotNull(actualUser2);
//        assertEquals(actualUser2.getUserType(), User.UserType.REGULAR_USER);
//        assertEquals(actualUser2.getUsername(), "donald");
//        assertEquals(actualUser2.getPassword(), "dbc321");
    }

    @Test
    public void getRegularUsers_hamcrest() {
        // arrange
        List<User> userList = new LinkedList<>();
        userList.add(User.createRegularUser("anne", "abc123"));
        userList.add(User.createRegularUser("donald", "dbc321"));
        userList.add(User.createAdminUser("beebop", "pwd098"));

        when(userRepository.findAll()).thenReturn(userList);

        // act
        Set<User> actualUsers = userLookupService.getRegularUsers();

        // assert
        assertNotNull(actualUsers);
        assertEquals(actualUsers.size(), 2);

//        // check user 1
//        User actualUser1 = userList.get(0);
//        assertNotNull(actualUser1);
//        assertEquals(actualUser1.getUserType(), User.UserType.REGULAR_USER);
//        assertEquals(actualUser1.getUsername(), "anne");
//        assertEquals(actualUser1.getPassword(), "abc123");
//
//        // check user 2
//        User actualUser2 = userList.get(0);
//        assertNotNull(actualUser2);
//        assertEquals(actualUser2.getUserType(), User.UserType.REGULAR_USER);
//        assertEquals(actualUser2.getUsername(), "donald");
//        assertEquals(actualUser2.getPassword(), "dbc321");
    }

    @Test
    public void getAdminUsers() {
        // arrange

        // act

        // assert
    }
}