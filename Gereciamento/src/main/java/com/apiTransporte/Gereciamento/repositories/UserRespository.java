package com.apiTransporte.Gereciamento.repositories;

import com.apiTransporte.Gereciamento.domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRespository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
