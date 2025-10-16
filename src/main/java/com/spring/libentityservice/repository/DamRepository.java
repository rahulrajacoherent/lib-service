package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Dam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DamRepository extends JpaRepository<Dam, Long> {

}
