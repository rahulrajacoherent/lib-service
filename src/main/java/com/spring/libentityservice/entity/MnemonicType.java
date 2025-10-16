package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Table(name = "mnemonic_type")
@Entity
@Getter
@Setter
public class MnemonicType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "value_category")
    private String valueCategory;
    @ManyToOne
    @JoinColumn(name = "role_id_fk")
    private DmsRoles dmsRoles;
    @Column(name = "need_approval")
    private Boolean needApproval;
    @Column(name = "deleted_flag")
    private Boolean deletedFlag;
    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "created_by")
    private Long createdBy;
    @UpdateTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "modified_at")
    private Timestamp modifiedAt;
    @Column(name = "modified_by")
    private Long modifiedBy;
}
