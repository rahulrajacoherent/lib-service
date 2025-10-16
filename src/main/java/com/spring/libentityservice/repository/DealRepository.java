package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepository extends JpaRepository<Deal,Integer> {
}
