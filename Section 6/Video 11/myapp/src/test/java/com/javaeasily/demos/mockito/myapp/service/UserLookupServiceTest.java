package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserLookupServiceTest {

    @Mock
    private UserRepository userRepository;

    @Test
    public void getRegularUsers() {

    }

    @Test
    public void getAdminUsers() {
    }
}