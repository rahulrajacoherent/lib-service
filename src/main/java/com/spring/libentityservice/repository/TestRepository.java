package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Testing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Testing,Integer> {
}
