package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Testing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingRepository extends JpaRepository<Testing,Integer> {
}
