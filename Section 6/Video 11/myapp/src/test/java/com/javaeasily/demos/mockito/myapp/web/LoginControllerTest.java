package com.javaeasily.demos.mockito.myapp.web;

import com.javaeasily.demos.mockito.myapp.service.AuthenticationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class LoginControllerTest {

    private LoginController controller;   // SUT

    private AuthenticationService service;   // mock

    @Before
    public void setUp() throws Exception {
        this.service = Mockito.mock(AuthenticationService.class);
        this.controller = new LoginController(this.service);
    }

    @Test
    public void testService_validUsernameAndPassword_logsInUser() {
        // arrange
        when(service.authenticate(anyString(), anyString())).thenReturn(true);

        // act
        String viewPath = controller.service("tom", "password123");

        // assert
        Assert.assertNotNull(viewPath);
        Assert.assertEquals("/home", viewPath);
    }
}