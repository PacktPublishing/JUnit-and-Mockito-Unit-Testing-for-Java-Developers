package com.javaeasily.demos.mockito.myapp;

public class LoginController {

    private AuthenticationService authenticationService;

    public String service(String username, String password) {
        return authenticationService.authenticate(username, password) ? "/home": "/login";
    }

}
