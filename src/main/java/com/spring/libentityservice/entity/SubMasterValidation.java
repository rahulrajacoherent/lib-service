package com.spring.libentityservice.entity;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "sub_master_validation")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SubMasterValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "previous_stage_id_fk")
    private StageMaster previousStageMaster;

    @ManyToOne
    @JoinColumn(name = "previous_tab_id_fk")
    private StageTabMapping previousStageTabMapping;

    @ManyToOne
    @JoinColumn(name = "master_validation_id_fk")
    private MasterValidation masterValidation;

    @Column(name = "validation_json")
    private String validationJson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public MasterValidation getMasterValidation() {
        return masterValidation;
    }

    public void setMasterValidation(MasterValidation masterValidation) {
        this.masterValidation = masterValidation;
    }

    public String getValidationJson() {
        return validationJson;
    }

    public void setValidationJson(String validationJson) {
        this.validationJson = validationJson;
    }
}
