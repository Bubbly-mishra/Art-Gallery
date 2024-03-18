package com.Art.Gallery.Art.Gallery.Service;

import com.Art.Gallery.Art.Gallery.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}