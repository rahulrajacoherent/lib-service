package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.StatusMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatusRepository extends JpaRepository<StatusMaster,Integer> {
    Optional<StatusMaster> findByStatusNameAndDeletedFlagFalse(String statusName);
}
