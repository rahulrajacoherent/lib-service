package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.StageMaster;
import com.spring.libentityservice.entity.StageTabMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StageTabMappingRepository extends JpaRepository<StageTabMapping,Integer> {

    Optional<StageTabMapping> findByTabNameAndStageMasterAndDeletedFlagFalse(String name, StageMaster stageMaster);

    @Query(value = "SELECT stm.* FROM stage_tab_mapping stm JOIN stage_master sm ON stm.stage_id_fk = sm.id WHERE stm.flow_type =:flowType AND (:type IS NULL OR stm.type =:type OR stm.type IS :type) ORDER BY stm.sort_order",nativeQuery = true)
    List<StageTabMapping> findTabs(String flowType,String type);

    @Query(value = "select a from StageTabMapping as a where a.flowType =: flowType and a.type =: type order by sortOrder")
    StageTabMapping findEnableTabs(String flowType,String type);
}
