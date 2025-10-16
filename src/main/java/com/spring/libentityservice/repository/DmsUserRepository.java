package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.DmsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DmsUserRepository extends JpaRepository<DmsUser, Integer> {

    Optional<DmsUser> findByEmailAndIsActiveTrue(String sub);
}

