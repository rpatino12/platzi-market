package com.platzi.market.domain.dto;

// To generate a JWT, we need a controller that accepts our username and password, and returns our JWT
// So this class accept the information necessary to create a jwt inside the controller
public class AuthenticationRequest {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
