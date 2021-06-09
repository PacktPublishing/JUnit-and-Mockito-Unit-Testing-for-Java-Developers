package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.User;
import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.hamcrest.Matchers;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
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

        assertThat(actualUsers, containsInAnyOrder(
            allOf(
                Matchers.hasProperty("username", equalTo("anne")),
                Matchers.hasProperty("password", equalTo("abc123"))
            ),
            allOf(
                Matchers.hasProperty("username", equalTo("donald")),
                Matchers.hasProperty("password", equalTo("dbc321"))
            )
        ));
    }

    @Test
    public void getAdminUsers() {
        // arrange

        // act

        // assert
    }
}