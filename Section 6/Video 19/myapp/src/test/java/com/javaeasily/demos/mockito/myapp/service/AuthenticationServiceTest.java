package com.javaeasily.demos.mockito.myapp.service;

import com.javaeasily.demos.mockito.myapp.data.UserRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

public class AuthenticationServiceTest {

    private AuthenticationService service; // SUT

    private UserRepository repository;  // mock

    @Before
    public void setUp() {
        this.repository = Mockito.mock(UserRepository.class);
        this.service = new AuthenticationService(repository);
    }

    @Ignore
    @Test
    public void testAuthenticate() {
        // arrange
        Mockito.when(this.repository.findByUsername(Mockito.anyString())).thenThrow(new IllegalArgumentException());

        // act
        this.service.authenticate("harry", "harry12345");

        // assert
    }

}