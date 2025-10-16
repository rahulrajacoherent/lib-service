package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.Documentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DocumentationRepository extends JpaRepository<Documentation,Integer> {
    Optional<Documentation> findByDealIdAndIsActive(Integer dealId, boolean b);


    @Query(value = "SELECT * FROM dms_portal.documentation where deal_id_fk in " +
            "(SELECT id FROM dms_portal.deal where id in (SELECT deal_id_fk FROM dms_portal.tranche_memo_details " +
            "where tranche_status=\"Dispatch\" and tranche=1 and is_active = 1))", nativeQuery = true)
    List<Documentation> findDocumentationList();

    Optional<Documentation> findByDealIdAndIsActiveAndTab(Integer id, boolean b, String tabName);
}
