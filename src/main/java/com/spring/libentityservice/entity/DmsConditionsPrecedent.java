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
@Table(name = "dms_conditions_precedent")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DmsConditionsPrecedent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cp")
    private String cp;

    @Column(name = "cp_value",columnDefinition = "TEXT")
    private String cpValue;

    @Column(name = "tranche_id")
    private Integer trancheId;

    @ManyToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @ManyToOne
    @JoinColumn(name = "term_sheet_id_fk")
    private TermSheet termSheet;

    @Column(name = "other_information_rights")
    private String otherInformationRights;

    @Column(name = "other_restrictive_convenent")
    private String otherRestrictiveConvenent;

    @Column(name = "events_of_default")
    private String eventsOfDefault;

    @Column(name = "consequences_of_default")
    private String consequencesOfDefault;

    @Column(name = "other_conditions")
    private String otherConditions;

    @Column(name = "dd_observation")
    private String ddObservation;

    @Column(name = "documentflag")
    private String documentFlag;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCpValue() {
        return cpValue;
    }

    public void setCpValue(String cpValue) {
        this.cpValue = cpValue;
    }

    public Integer getTrancheId() {
        return trancheId;
    }

    public void setTrancheId(Integer trancheId) {
        this.trancheId = trancheId;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public TermSheet getTermSheet() {
        return termSheet;
    }

    public void setTermSheet(TermSheet termSheet) {
        this.termSheet = termSheet;
    }

    public String getOtherInformationRights() {
        return otherInformationRights;
    }

    public void setOtherInformationRights(String otherInformationRights) {
        this.otherInformationRights = otherInformationRights;
    }

    public String getOtherRestrictiveConvenent() {
        return otherRestrictiveConvenent;
    }

    public void setOtherRestrictiveConvenent(String otherRestrictiveConvenent) {
        this.otherRestrictiveConvenent = otherRestrictiveConvenent;
    }

    public String getEventsOfDefault() {
        return eventsOfDefault;
    }

    public void setEventsOfDefault(String eventsOfDefault) {
        this.eventsOfDefault = eventsOfDefault;
    }

    public String getConsequencesOfDefault() {
        return consequencesOfDefault;
    }

    public void setConsequencesOfDefault(String consequencesOfDefault) {
        this.consequencesOfDefault = consequencesOfDefault;
    }

    public String getOtherConditions() {
        return otherConditions;
    }

    public void setOtherConditions(String otherConditions) {
        this.otherConditions = otherConditions;
    }

    public String getDdObservation() {
        return ddObservation;
    }

    public void setDdObservation(String ddObservation) {
        this.ddObservation = ddObservation;
    }

    public String getDocumentFlag() {
        return documentFlag;
    }

    public void setDocumentFlag(String documentFlag) {
        this.documentFlag = documentFlag;
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
