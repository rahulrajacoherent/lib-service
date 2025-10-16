package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Cacheable;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "deal")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "generated_deal_id")
    private String generatedDealId;

    @Column(name = "deal_name")
    private String dealName;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(promoter_name),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "promoter_name", columnDefinition = "TEXT")
    private String promoterName;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(cin_number),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "cin_number")
    private String cinNumber;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(company_pan_no),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "company_pan_no")
    private String companyPanNo;

    @Column(name = "status")
    private Boolean status;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(promoters_pan_no),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "promoters_pan_no", columnDefinition = "TEXT")
    private String promotersPanNo;

    @ManyToOne
    @JoinColumn(name = "user_id_fk")
    private DmsUser dmsUser;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "company_id_fk")
    private CompanyDetails companyDetails;

    @Column(name = "registered_email")
    private String registeredEmail;

    @Column(name = "registered_mobile_no")
    private String registeredMobileNo;

    @ManyToOne
    @JoinColumn(name = "deal_source_id_fk")
    private MnemonicMasterNew dealSource;

    @ManyToOne
    @JoinColumn(name = "deal_cash_flow_id_fk")
    private MnemonicMasterNew dealCashFlow;

    @ManyToOne
    @JoinColumn(name = "stage_id_fk")
    private StageMaster stageMaster;

    @OneToOne
    @JoinColumn(name = "previous_stage_id_fk")
    private StageMaster previousStageMaster;

    @Column(name = "memo_details_flag")
    private Boolean memoDetailsFlag;

    @Column(name = "current_tranche")
    private Integer currentTranche;

    @Column(name = "mandatory_flag")
    private Integer mandatoryFlag;

    @Column(name = "another_mandatory_flag")
    private Integer anotherMandatoryFlag;

    @Column(name = "current_memo_type")
    private String currentMemoType;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "deleted_flag")
    private Boolean deletedFlag;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "owner_id_fk", updatable = false)
    private Long ownerId;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "migration_flag")
    private Boolean migrationFlag;

    @Column(name = "migration_status")
    private Boolean migrationStatus;

    @Column(name = "equity_memo_enable_flag")
    private Boolean equityMemoEnableFlag;

    @Column(name = "deal_size")
    private String dealSize;

    @ManyToOne
    @JoinColumn(name = "deal_description_id_fk")
    private MnemonicMasterNew dealDescriptions;

    @Column(name = "notes",columnDefinition = "TEXT")
    private String notes;

    @Column(name = "deal_description",columnDefinition = "TEXT")
    private String dealDescription;

    @Column(name = "edit_restrict_flag")
    private Boolean editRestrictFlag;

    @Column(name = "edit_user_name")
    private String editUserName;

    @Column(name = "hold_or_reject_comment", columnDefinition = "TEXT")
    private String holdAndRejectComment;

    @OneToOne
    @JoinColumn(name = "reason_for_rejection_id_fk")
    private MnemonicMasterNew reasonForRejection;

    @Column(name = "hold_duration")
    private String holdDuration;

    @Column(name = "deal_active_status")
    private String dealActiveStatus;

    @Column(name = "deal_type")
    private String dealType;

    @Column(name = "flow_type")
    private String flowType;

    @OneToMany(mappedBy = "deal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<PromotorDetails> promotorDetails = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "documentation_id_fk")
    private Documentation documentation;
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

    public String getGeneratedDealId() {
        return generatedDealId;
    }

    public void setGeneratedDealId(String generatedDealId) {
        this.generatedDealId = generatedDealId;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getPromoterName() {
        return promoterName;
    }

    public void setPromoterName(String promoterName) {
        this.promoterName = promoterName;
    }

    public String getCinNumber() {
        return cinNumber;
    }

    public void setCinNumber(String cinNumber) {
        this.cinNumber = cinNumber;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public DmsUser getDmsUser() {
        return dmsUser;
    }

    public void setDmsUser(DmsUser dmsUser) {
        this.dmsUser = dmsUser;
    }

    public CompanyDetails getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    public MnemonicMasterNew getDealSource() {
        return dealSource;
    }

    public void setDealSource(MnemonicMasterNew dealSource) {
        this.dealSource = dealSource;
    }

    public MnemonicMasterNew getDealCashFlow() {
        return dealCashFlow;
    }

    public void setDealCashFlow(MnemonicMasterNew dealCashFlow) {
        this.dealCashFlow = dealCashFlow;
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
    public Integer getCurrentTranche() {
        return currentTranche;
    }

    public void setCurrentTranche(Integer currentTranche) {
        this.currentTranche = currentTranche;
    }

    public Integer getMandatoryFlag() {
        return mandatoryFlag;
    }

    public void setMandatoryFlag(Integer mandatoryFlag) {
        this.mandatoryFlag = mandatoryFlag;
    }

    public Integer getAnotherMandatoryFlag() {
        return anotherMandatoryFlag;
    }

    public void setAnotherMandatoryFlag(Integer anotherMandatoryFlag) {
        this.anotherMandatoryFlag = anotherMandatoryFlag;
    }

    public String getCurrentMemoType() {
        return currentMemoType;
    }

    public void setCurrentMemoType(String currentMemoType) {
        this.currentMemoType = currentMemoType;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

    public Boolean getEquityMemoEnableFlag() {
        return equityMemoEnableFlag;
    }

    public void setEquityMemoEnableFlag(Boolean equityMemoEnableFlag) {
        this.equityMemoEnableFlag = equityMemoEnableFlag;
    }

    public String getDealSize() {
        return dealSize;
    }

    public void setDealSize(String dealSize) {
        this.dealSize = dealSize;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getEditRestrictFlag() {
        return editRestrictFlag;
    }

    public void setEditRestrictFlag(Boolean editRestrictFlag) {
        this.editRestrictFlag = editRestrictFlag;
    }

    public String getEditUserName() {
        return editUserName;
    }

    public void setEditUserName(String editUserName) {
        this.editUserName = editUserName;
    }

    public String getHoldAndRejectComment() {
        return holdAndRejectComment;
    }

    public void setHoldAndRejectComment(String holdAndRejectComment) {
        this.holdAndRejectComment = holdAndRejectComment;
    }

    public MnemonicMasterNew getReasonForRejection() {
        return reasonForRejection;
    }

    public void setReasonForRejection(MnemonicMasterNew reasonForRejection) {
        this.reasonForRejection = reasonForRejection;
    }

    public String getHoldDuration() {
        return holdDuration;
    }

    public void setHoldDuration(String holdDuration) {
        this.holdDuration = holdDuration;
    }

    public String getDealActiveStatus() {
        return dealActiveStatus;
    }

    public void setDealActiveStatus(String dealActiveStatus) {
        this.dealActiveStatus = dealActiveStatus;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public List<PromotorDetails> getPromotorDetails() {
        return promotorDetails;
    }

    public void setPromotorDetails(List<PromotorDetails> promotorDetails) {
        this.promotorDetails = promotorDetails;
    }

    public String getCompanyPanNo() {
        return companyPanNo;
    }

    public void setCompanyPanNo(String companyPanNo) {
        this.companyPanNo = companyPanNo;
    }

    public String getPromotersPanNo() {
        return promotersPanNo;
    }

    public void setPromotersPanNo(String promotersPanNo) {
        this.promotersPanNo = promotersPanNo;
    }

    public String getRegisteredEmail() {
        return registeredEmail;
    }

    public void setRegisteredEmail(String registeredEmail) {
        this.registeredEmail = registeredEmail;
    }

    public String getRegisteredMobileNo() {
        return registeredMobileNo;
    }

    public void setRegisteredMobileNo(String registeredMobileNo) {
        this.registeredMobileNo = registeredMobileNo;
    }

    public Boolean getMemoDetailsFlag() {
        return memoDetailsFlag;
    }

    public void setMemoDetailsFlag(Boolean memoDetailsFlag) {
        this.memoDetailsFlag = memoDetailsFlag;
    }

    public Boolean getMigrationFlag() {
        return migrationFlag;
    }

    public void setMigrationFlag(Boolean migrationFlag) {
        this.migrationFlag = migrationFlag;
    }

    public Boolean getMigrationStatus() {
        return migrationStatus;
    }

    public void setMigrationStatus(Boolean migrationStatus) {
        this.migrationStatus = migrationStatus;
    }

    public MnemonicMasterNew getDealDescriptions() {
        return dealDescriptions;
    }

    public void setDealDescriptions(MnemonicMasterNew dealDescriptions) {
        this.dealDescriptions = dealDescriptions;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public Documentation getDocumentation() {
        return documentation;
    }

    public void setDocumentation(Documentation documentation) {
        this.documentation = documentation;
    }
}
