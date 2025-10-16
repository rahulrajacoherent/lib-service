package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.UpdateCommercials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateCommercialsRepository extends JpaRepository<UpdateCommercials, Integer> {

}
