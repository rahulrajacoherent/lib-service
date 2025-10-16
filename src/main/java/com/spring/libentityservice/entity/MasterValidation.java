package com.spring.libentityservice.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "master_validation")
public class MasterValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "stage_id_fk")
    private StageMaster stageMaster;

    @ManyToOne
    @JoinColumn(name = "tab_id_fk")
    private StageTabMapping stageTabMapping;

    @OneToMany(mappedBy = "masterValidation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubMasterValidation> subMasterValidations;

    @ManyToOne
    @JoinColumn(name = "status_id_fk")
    private StatusMaster statusMaster;

    @Column(name = "validation_json")
    private String validationJson;

    @Column(name = "flow_type")
    private String flowType;


    @Column(name = "next_stage")
    private Integer nextStage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StageMaster getStageMaster() {
        return stageMaster;
    }

    public void setStageMaster(StageMaster stageMaster) {
        this.stageMaster = stageMaster;
    }

    public StageTabMapping getStageTabMapping() {
        return stageTabMapping;
    }

    public void setStageTabMapping(StageTabMapping stageTabMapping) {
        this.stageTabMapping = stageTabMapping;
    }

    public StatusMaster getStatusMaster() {
        return statusMaster;
    }

    public void setStatusMaster(StatusMaster statusMaster) {
        this.statusMaster = statusMaster;
    }

    public String getValidationJson() {
        return validationJson;
    }

    public void setValidationJson(String validationJson) {
        this.validationJson = validationJson;
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

    public List<SubMasterValidation> getSubMasterValidations() {
        return subMasterValidations;
    }

    public void setSubMasterValidations(List<SubMasterValidation> subMasterValidations) {
        this.subMasterValidations = subMasterValidations;
    }
}
