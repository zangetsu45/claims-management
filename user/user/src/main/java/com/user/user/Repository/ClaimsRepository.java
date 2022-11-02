package com.user.user.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.user.model.claims;


public interface ClaimsRepository extends JpaRepository<claims, Integer> {
        public Optional<claims> findByEmail(String email);
}
