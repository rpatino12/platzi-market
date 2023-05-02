package com.platzi.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlatziUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Here we create the desired user to access to our api
        // We have to use the keyword noop, because the password is not encoded in this case
        // And the ArrayList is to set the profile or the role for the user
        return new User("ricardo", "{noop}platzi", new ArrayList<>());
    }
}
