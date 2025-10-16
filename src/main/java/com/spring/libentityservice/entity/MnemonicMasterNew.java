package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "mnemonic_master_new")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MnemonicMasterNew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mnemonic_type_id")
    private MnemonicType mnemonicType;

    @Column(name = "mnemonic_name")
    private String mnemonicColumnName;

    @Column(name = "mnemonic_value")
    private String mnemonicColumnValue;

    @Column(name="sort_order")
    private int sortOrder;

    @Column(name="delete_approval")
    private String deleteApproval;

    @Column(name = "deleted_flag")
    private Boolean deletedFlag;

    @Column(name = "created_by")
    private Long createdBy;

    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at",updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "modified_by")
    private Long modifiedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MnemonicType getMnemonicType() {
        return mnemonicType;
    }

    public void setMnemonicType(MnemonicType mnemonicType) {
        this.mnemonicType = mnemonicType;
    }

    public String getMnemonicColumnName() {
        return mnemonicColumnName;
    }

    public void setMnemonicColumnName(String mnemonicColumnName) {
        this.mnemonicColumnName = mnemonicColumnName;
    }

    public String getMnemonicColumnValue() {
        return mnemonicColumnValue;
    }

    public void setMnemonicColumnValue(String mnemonicColumnValue) {
        this.mnemonicColumnValue = mnemonicColumnValue;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getDeleteApproval() {
        return deleteApproval;
    }

    public void setDeleteApproval(String deleteApproval) {
        this.deleteApproval = deleteApproval;
    }

    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
