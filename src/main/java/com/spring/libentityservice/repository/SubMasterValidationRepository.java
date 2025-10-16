package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.SubMasterValidation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubMasterValidationRepository extends JpaRepository<SubMasterValidation,Integer> {


    @Query(value = "SELECT smv.* FROM dynamic_portal.deal d " +
            "INNER JOIN dynamic_portal.stage_tab_mapping stm " +
            "ON stm.stage_id_fk >= :stageId AND stm.stage_id_fk <= d.stage_id_fk " +
            "INNER JOIN dynamic_portal.deal_validation mv " +
            "ON mv.stage_id_fk = stm.stage_id_fk " +
            "AND mv.previous_stage_id_fk = :previousStageId " +
            "AND mv.previous_tab_id_fk = :previousTabId " +
            "AND d.id = mv.deal_id_fk " +
            "INNER JOIN dynamic_portal.sub_master_validation smv " +
            "ON smv.master_validation_id_fk = mv.master_validation_id_fk " +
            "AND smv.previous_stage_id_fk = mv.previous_stage_id_fk " +
            "AND smv.previous_tab_id_fk = mv.previous_tab_id_fk " +
            "WHERE d.id = :dealId ", nativeQuery = true)
    List<SubMasterValidation> findSubMasterValidationsByDealId(
            @Param("dealId") Integer dealId,
            @Param("previousStageId") Integer previousStageId,
            @Param("previousTabId") Integer previousTabId,
            @Param("stageId") Integer stageId
    );
    List<SubMasterValidation> findAllByMasterValidationId(Integer masterId);

    @Query(value = "SELECT DISTINCT smv.* " +
            "FROM dynamic_portal.deal d " +
            "INNER JOIN dynamic_portal.stage_tab_mapping stm " +
            "    ON stm.stage_id_fk BETWEEN :stageId AND d.stage_id_fk " +
            "INNER JOIN dynamic_portal.deal_validation mv " +
            "    ON mv.stage_id_fk = stm.stage_id_fk " +
            "    AND d.id = mv.deal_id_fk " +
            "INNER JOIN dynamic_portal.sub_master_validation smv " +
            "    ON smv.master_validation_id_fk = mv.master_validation_id_fk " +
            "WHERE d.id = :dealId", nativeQuery = true)
    List<SubMasterValidation> findSubMasterValidations(
            @Param("dealId") Integer dealId,
            @Param("stageId") Integer stageId
    );

    SubMasterValidation findByMasterValidationId(Integer masterId);

}
