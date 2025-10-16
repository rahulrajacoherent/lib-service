package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.MillWright;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MillWrightRepository extends JpaRepository<MillWright, Long> {

}
