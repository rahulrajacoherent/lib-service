package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.DealHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DealHistoryRepository extends JpaRepository<DealHistory,Integer> {
}
