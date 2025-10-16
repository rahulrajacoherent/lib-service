package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.PromotorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotorDetailsRepository extends JpaRepository<PromotorDetails,Integer> {
}
