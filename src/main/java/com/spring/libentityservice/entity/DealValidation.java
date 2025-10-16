package com.spring.libentityservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "deal_validation")
public class DealValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "stage_id_fk")
    private StageMaster stageMaster;

    @ManyToOne
    @JoinColumn(name = "previous_stage_id_fk")
    private StageMaster previousStageMaster;

    @ManyToOne
    @JoinColumn(name = "previous_tab_id_fk")
    private StageTabMapping previousStageTabMapping;

    @Column(name = "status")
    private String status;

    @Column(name = "response")
    private String response;

    @ManyToOne
    @JoinColumn(name = "master_validation_id_fk")
    private MasterValidation masterValidation;

    @Column(name = "validation_type")
    private String validationType;

    @ManyToOne
    @JoinColumn(name = "sub_master_validation_id_fk")
    private SubMasterValidation subMasterValidation;

    @ManyToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

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

    public StageMaster getPreviousStageMaster() {
        return previousStageMaster;
    }

    public void setPreviousStageMaster(StageMaster previousStageMaster) {
        this.previousStageMaster = previousStageMaster;
    }

    public StageTabMapping getPreviousStageTabMapping() {
        return previousStageTabMapping;
    }

    public void setPreviousStageTabMapping(StageTabMapping previousStageTabMapping) {
        this.previousStageTabMapping = previousStageTabMapping;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public MasterValidation getMasterValidation() {
        return masterValidation;
    }

    public void setMasterValidation(MasterValidation masterValidation) {
        this.masterValidation = masterValidation;
    }

    public String getValidationType() {
        return validationType;
    }

    public void setValidationType(String validationType) {
        this.validationType = validationType;
    }

    public SubMasterValidation getSubMasterValidation() {
        return subMasterValidation;
    }

    public void setSubMasterValidation(SubMasterValidation subMasterValidation) {
        this.subMasterValidation = subMasterValidation;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
}
