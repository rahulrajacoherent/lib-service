package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.StageMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StageMasterRepository extends JpaRepository<StageMaster,Integer> {
}
