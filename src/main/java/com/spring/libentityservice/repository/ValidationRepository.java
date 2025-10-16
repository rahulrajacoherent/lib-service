package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Validation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationRepository extends JpaRepository<Validation,Integer> {
}
