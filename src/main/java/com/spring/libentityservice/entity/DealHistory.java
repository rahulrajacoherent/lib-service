package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "deal_history")
public class DealHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @JoinColumn(name = "generated_company_id")
    private String generatedCompanyId;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "deleted_flag")
    private Boolean deletedFlag;
    @Column(name = "message")
    private String message;

    @ManyToOne
    @JoinColumn(name = "stage_id_fk")
    private StageMaster stageMaster;

    @ManyToOne
    @JoinColumn(name = "status_id_fk")
    private UserStageStatus statusMaster;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "payload",columnDefinition = "TEXT")
    private String payload;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    @PrePersist
    public void prePersist() {
        this.isActive = Boolean.TRUE;
        this.deletedFlag = Boolean.FALSE;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public String getGeneratedCompanyId() {
        return generatedCompanyId;
    }

    public void setGeneratedCompanyId(String generatedCompanyId) {
        this.generatedCompanyId = generatedCompanyId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StageMaster getStageMaster() {
        return stageMaster;
    }

    public void setStageMaster(StageMaster stageMaster) {
        this.stageMaster = stageMaster;
    }

    public UserStageStatus getStatusMaster() {
        return statusMaster;
    }

    public void setStatusMaster(UserStageStatus statusMaster) {
        this.statusMaster = statusMaster;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
