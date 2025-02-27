package com.url.shortner.repository;

import com.url.shortner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepostory extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);

}
