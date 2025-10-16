package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.DealManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealManagementRepository extends JpaRepository<DealManagement, Long> {

}
