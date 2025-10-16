package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.MnemonicMasterNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MnemonicMasterNewRepository extends JpaRepository<MnemonicMasterNew, Long>  {

    @Query(value = """
    SELECT mmn.*  FROM dms_portal.mnemonic_type as mt
    INNER JOIN mnemonic_master_new as mmn ON mmn.mnemonic_type_id = mt.id
    WHERE mt.code = :name AND mmn.deleted_flag <> 1 AND  (delete_approval IS NULL OR delete_approval <> 'approved') ORDER BY sort_order ASC
    """, nativeQuery = true)
    Object findByMnemonicColumnNameList(String name);
}
