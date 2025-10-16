package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Tests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestsRepository extends JpaRepository<Tests,Integer> {
}
