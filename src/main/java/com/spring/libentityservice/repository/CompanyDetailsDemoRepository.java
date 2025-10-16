package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.CompanyDetailsDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDetailsDemoRepository extends JpaRepository<CompanyDetailsDemo, Long> {

}
