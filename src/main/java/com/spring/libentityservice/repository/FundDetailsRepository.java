package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.FundDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundDetailsRepository extends JpaRepository<FundDetails,Integer> {

}
