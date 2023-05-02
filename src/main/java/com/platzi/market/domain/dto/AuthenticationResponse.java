package com.platzi.market.domain.dto;

// To generate a JWT, we need a controller that accepts our username and password, and returns our JWT
// So this class send the information necessary to create a jwt inside the controller
public class AuthenticationResponse {
    private String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
