package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.DealValidation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealValidationRepository extends JpaRepository<DealValidation,Integer> {
}
