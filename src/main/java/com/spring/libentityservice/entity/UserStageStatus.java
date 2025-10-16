package com.spring.libentityservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_stage_status")
@Getter
@Setter
public class UserStageStatus {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "page_name")
    private String pageName;

    @ManyToOne
    @JoinColumn(name = "stage_id_fk")
    private StageMaster stageMaster;

    @ManyToOne
    @JoinColumn(name = "status_id_fk")
    private StatusMaster statusMaster;

    @Column(name = "flow_type")
    private String flowType;

    @Column(name = "validation")
    private String validation;

    @Column(name = "next_stage")
    private Integer nextStage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public StageMaster getStageMaster() {
        return stageMaster;
    }

    public void setStageMaster(StageMaster stageMaster) {
        this.stageMaster = stageMaster;
    }

    public StatusMaster getStatusMaster() {
        return statusMaster;
    }

    public void setStatusMaster(StatusMaster statusMaster) {
        this.statusMaster = statusMaster;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public Integer getNextStage() {
        return nextStage;
    }

    public void setNextStage(Integer nextStage) {
        this.nextStage = nextStage;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }
}
