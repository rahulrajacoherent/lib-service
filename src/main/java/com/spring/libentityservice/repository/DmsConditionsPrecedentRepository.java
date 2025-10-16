package com.spring.libentityservice.repository;
import com.spring.libentityservice.entity.DmsConditionsPrecedent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DmsConditionsPrecedentRepository extends JpaRepository<DmsConditionsPrecedent,Integer> {

    List<DmsConditionsPrecedent> findAllByDealIdAndTermSheetId(Integer id, Integer id1);


    List<DmsConditionsPrecedent> findAllByTermSheetId(Integer id);

    List<DmsConditionsPrecedent> findAllByDealIdAndDocumentFlag(Integer id, String a);
}
