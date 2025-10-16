package com.spring.libentityservice.repository;
import com.spring.libentityservice.dto.MasterStatusDTO;
import com.spring.libentityservice.dto.MasterValidationDTO;
import com.spring.libentityservice.entity.MasterValidation;
import com.spring.libentityservice.entity.StageMaster;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface MasterValidationRepository extends JpaRepository<MasterValidation,Integer> {

    @Cacheable(value = "masterValidation", key = "{#stageId, #tabId, #statusId, #flowType}")
    List<MasterValidation> findAllByStageMasterIdAndStageTabMappingIdAndStatusMasterIdAndFlowType(Integer stageId, Integer tabId, Integer statusId, String flowType);

    @Cacheable(value = "masterValidationId", key = "{#stageId, #tabId, #statusId, #flowType}")
    @Query("SELECT mv.id FROM MasterValidation mv " +
            "WHERE mv.stageMaster.id = :stageId " +
            "AND mv.stageTabMapping.id = :tabId " +
            "AND mv.statusMaster.id = :statusId " +
            "AND mv.flowType = :flowType")
    Optional<Integer> findIdByStageMasterIdAndStageTabMappingIdAndStatusMasterIdAndFlowType(
            @Param("stageId") Integer stageId,
            @Param("tabId") Integer tabId,
            @Param("statusId") Integer statusId,
            @Param("flowType") String flowType
    );
    List<MasterValidation> findAllByStageMasterIdAndStageTabMappingId(Integer stageMasterId,Integer tabId);

    Optional<MasterValidation> findByStageMaster(StageMaster stageMaster);

    List<MasterValidation> findAllByStageMasterId(Integer id);

    @Cacheable(value = "masterValidation", key = "'findValidations:' + #type + ':' + #flowType + ':' + #tabName")
    @Query(value ="SELECT new com.spring.libentityservice.dto.MasterValidationDTO(mv.id,sm.id,sm.stage,stm.id,stm.tabName,smv.id,stmt.id,stmt.statusName,mv.validationJson,mv.flowType,mv.nextStage,smv.validationJson,psm.id,psm.stage,pstm.id,pstm.tabName,stm.type) FROM MasterValidation mv LEFT JOIN mv.stageMaster sm LEFT JOIN mv.stageTabMapping stm LEFT JOIN mv.subMasterValidations smv LEFT JOIN mv.statusMaster stmt LEFT JOIN smv.previousStageMaster psm LEFT JOIN smv.previousStageTabMapping pstm WHERE mv.flowType = :flowType AND LOWER(stm.tabName) = LOWER(:tabName) AND ((:type IS NULL AND stm.type IS NULL) OR (:type IS NOT NULL AND stm.type = :type))")
    List<MasterValidationDTO> findValidations(@Param("type") String type,@Param("flowType") String flowType,@Param("tabName") String tabName);

    @Cacheable(value = "masterValidation", key = "'findValidationsById:' + #id")
    @Query(value ="SELECT new com.spring.libentityservice.dto.MasterValidationDTO(mv.id,sm.id,sm.stage,stm.id,stm.tabName,smv.id,stmt.id,stmt.statusName,mv.validationJson,mv.flowType,mv.nextStage,smv.validationJson,psm.id,psm.stage,pstm.id,pstm.tabName,stm.type) FROM MasterValidation mv LEFT JOIN mv.stageMaster sm LEFT JOIN mv.stageTabMapping stm LEFT JOIN mv.subMasterValidations smv LEFT JOIN mv.statusMaster stmt LEFT JOIN smv.previousStageMaster psm LEFT JOIN smv.previousStageTabMapping pstm WHERE mv.id=:id")
    MasterValidationDTO findValidationsById(@Param("id") Integer id);

    @Cacheable(value = "masterStatusCache", key = "#flowType")
    @Query("SELECT DISTINCT new com.spring.libentityservice.dto.MasterStatusDTO(sm.id, sm.statusName) " +
            "FROM MasterValidation mv " +
            "JOIN mv.statusMaster sm " +
            "WHERE mv.flowType = :flowType")
    List<MasterStatusDTO> findDistinctStatusesByFlowType(@Param("flowType") String flowType);

}
