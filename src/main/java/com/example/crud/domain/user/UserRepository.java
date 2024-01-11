package com.example.crud.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    userDetails findByLogin(String login);
}
