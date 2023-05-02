package com.platzi.market.web.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {
    // The key to create a token
    private static final String KEY = "pl4tz1";

    // This method generates a JWT (JSON Web Token)
    public String generateToken(UserDetails userDetails){
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // create expiration in 10 hours
                .signWith(SignatureAlgorithm.HS256, KEY)
                .compact();
    }
}
