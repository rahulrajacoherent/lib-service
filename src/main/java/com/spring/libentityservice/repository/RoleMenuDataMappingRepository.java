package com.spring.libentityservice.repository;
import com.spring.libentityservice.entity.RoleMenuDataMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleMenuDataMappingRepository extends JpaRepository<RoleMenuDataMapping,Integer> {
    @Query("SELECT r FROM RoleMenuDataMapping r WHERE r.dmsRoles.id = :id")
    RoleMenuDataMapping findByRoleId(@Param("id") Integer id);

    @Query("SELECT r FROM RoleMenuDataMapping r WHERE r.dmsRoles.id = :id and r.flowType = :flowType")
    RoleMenuDataMapping findByRoleIdAndFlowType(@Param("id") Integer id,@Param("flowType") String flowType);

    @Query("SELECT r FROM RoleMenuDataMapping r WHERE r.dmsRoles.id = :id AND r.flowType = :flowType")
    RoleMenuDataMapping findByRoleIdAndType(@Param("id") Integer id, @Param("flowType") String flowType);
}
