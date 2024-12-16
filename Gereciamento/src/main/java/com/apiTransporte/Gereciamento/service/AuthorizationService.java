package com.apiTransporte.Gereciamento.service;

import com.apiTransporte.Gereciamento.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService implements UserDetailsService {
    @Autowired
    UserRespository respository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return respository.findByLogin(username);
    }
}
