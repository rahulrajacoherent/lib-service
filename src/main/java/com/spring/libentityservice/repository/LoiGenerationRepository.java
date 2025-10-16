package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.LoiGeneration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoiGenerationRepository extends JpaRepository<LoiGeneration,Integer> {
}
