package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.UserStageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserStageStatusRepository extends JpaRepository<UserStageStatus,Integer> {


    @Query("SELECT u FROM UserStageStatus u WHERE u.stageMaster.id = :stageId AND u.statusMaster.id = :statusId")
    Optional<UserStageStatus> findByStageMasterIdAndStatusMasterId(Integer stageId, Integer statusId);
}
