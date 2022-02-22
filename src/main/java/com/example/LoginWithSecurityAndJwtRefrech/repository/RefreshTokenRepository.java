package com.example.LoginWithSecurityAndJwtRefrech.repository;

import com.example.LoginWithSecurityAndJwtRefrech.entity.RefreshToken;
import com.example.LoginWithSecurityAndJwtRefrech.entity.User;
import org.springframework.data.domain.Example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;


import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    @Override
    Optional<RefreshToken> findById(Long id);
    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);
}
