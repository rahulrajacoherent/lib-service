package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Data_Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_RepoRepository extends JpaRepository<Data_Repo, Long> {

}
