package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.TrancheDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface TrancheDetailsRepository extends JpaRepository<TrancheDetails, Integer>, JpaSpecificationExecutor<TrancheDetails> {
}
