package com.jwt.repo;

import com.jwt.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Admin, Long> {
   
    public Admin findByUsername(String username);
}
