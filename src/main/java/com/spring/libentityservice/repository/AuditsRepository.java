package com.spring.libentityservice.repository;


import com.spring.libentityservice.entity.Audits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditsRepository extends JpaRepository<Audits, Long> {

}
