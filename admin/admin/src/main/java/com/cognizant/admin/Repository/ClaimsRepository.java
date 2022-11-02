package com.cognizant.admin.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.admin.model.Claims;



public interface ClaimsRepository extends JpaRepository<Claims, Integer> {
        public Optional<Claims> findByEmail(String email);
}
