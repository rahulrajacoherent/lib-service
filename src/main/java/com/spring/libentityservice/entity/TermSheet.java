package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "deal_term_sheet")
public class TermSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @Column(name = "accept_flag")
    private Integer acceptFlag;

    @Column(name = "term_sheet_number")
    private String termSheetNumber;

    @Column(name = "date_of_term_sheet")
    private String dateOfTermSheet;

    @Column(name = "term_type")
    private String termType;

    @Column(name = "default_interst_option")
    private String defaultInterestOption;

    @Column(name = "transfer_by_investor")
    private String transferByInvestor;

    @Column(name = "condition_to_closing",columnDefinition = "TEXT")
    private String conditionToClosing;

    @Column(name = "business_Plan_condition",columnDefinition = "TEXT")
    private String businessPlanCondition;

    @Column(name = "other_matters",columnDefinition = "TEXT")
    private String otherMatters;


    @Column(name = "other_shareholders")
    private String otherShareHolders;

    @Column(name = "debenture_trustee")
    private String debentureTrustee;

    @Column(name = "others")
    private String others;

    @Column(name = "depository")
    private String depository;

    @Column(name = "register_and_transfer_agent")
    private String registerAndTransferAgent;

    @Column(name = "business_of_the_issuer")
    private String businessOfTheIssuer;

    @Column(name = "face_value")
    private String faceValue;

    @Column(name = "issue_size")
    private String issueSize;

    @Column(name = "deemed_date_allotment_flag")
    private Integer deemedDateAllotment;


    @Column(name = "commitment_fee")
    private String commitmentFee;

    @Column(name = "voluntary_prepayment")
    private String voluntaryPrepayment;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(redemption_provisions),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "redemption_provisions")
    private String redemptionProvisions;

    @Column(name = "grace_period")
    private Long gracePeriod;

    @Column(name = "grace_period_days")
    private String gracePeriodDays;

    @Column(name = "grace_period_words")
    private String gracePeriodWords;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(default_interest),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "default_interest")
    private String defaultInterest;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(default_interest_words),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "default_interest_words")
    private String defaultInterestWords;

    @Column(name = "information_flag_1")
    private Boolean informationFlag1;

    @Column(name = "information_flag_1_description")
    private String informationFlag1Description;

    @Column(name = "information_flag_2")
    private Boolean informationFlag2;

    @Column(name = "information_flag_2_description")
    private String informationFlag2Description;

    @Column(name = "information_flag_3")
    private Boolean informationFlag3;

    @Column(name = "information_flag_3_description")
    private String informationFlag3Description;

    @Column(name = "information_flag_4")
    private Boolean informationFlag4;

    @Column(name = "information_flag_4_description")
    private String informationFlag4Description;

    @Column(name = "information_flag_5")
    private Boolean informationFlag5;

    @Column(name = "information_flag_5_description")
    private String informationFlag5Description;

    @Column(name = "information_flag_6")
    private Boolean informationFlag6;

    @Column(name = "information_flag_6_description")
    private String informationFlag6Description;

    @Column(name = "restrictive_covenants_flag_1")
    private Boolean restrictiveCovenantsFlag1;

    @Column(name = "restrictive_covenants_flag_1_description")
    private String restrictiveCovenantsFlag1Description;

    @Column(name = "restrictive_covenants_flag_2")
    private Boolean restrictiveCovenantsFlag2;

    @Column(name = "restrictive_covenants_flag_2_description")
    private String restrictiveCovenantsFlag2Description;

    @Column(name = "restrictive_covenants_flag_3")
    private Boolean restrictiveCovenantsFlag3;

    @Column(name = "restrictive_covenants_flag_3_description")
    private String restrictiveCovenantsFlag3Description;

    @Column(name = "restrictive_covenants_flag_4")
    private Boolean restrictiveCovenantsFlag4;

    @Column(name = "restrictive_covenants_flag_4_description")
    private String restrictiveCovenantsFlag4Description;

    @Column(name = "restrictive_covenants_flag_5")
    private Boolean restrictiveCovenantsFlag5;

    @Column(name = "restrictive_covenants_flag_5_description")
    private String restrictiveCovenantsFlag5Description;

    @Column(name = "events_of_default_flag_1")
    private Boolean eventsOfDefaultFlag1;

    @Column(name = "events_of_default_flag_1_description")
    private String eventsOfDefaultFlag1Description;

    @Column(name = "events_of_default_flag_2")
    private Boolean eventsOfDefaultFlag2;

    @Column(name = "events_of_default_flag_2_description")
    private String eventsOfDefaultFlag2Description;

    @Column(name = "events_of_default_flag_3")
    private Boolean eventsOfDefaultFlag3;

    @Column(name = "events_of_default_flag_3_description")
    private String eventsOfDefaultFlag3Description;

    @Column(name = "events_of_default_flag_4")
    private Boolean eventsOfDefaultFlag4;

    @Column(name = "events_of_default_flag_4_description")
    private String eventsOfDefaultFlag4Description;

    @Column(name = "events_of_default_flag_5")
    private Boolean eventsOfDefaultFlag5;

    @Column(name = "events_of_default_flag_5_description")
    private String eventsOfDefaultFlag5Description;

    @Column(name = "events_of_default_flag_6")
    private Boolean eventsOfDefaultFlag6;

    @Column(name = "events_of_default_flag_6_description")
    private String eventsOfDefaultFlag6Description;

    @Column(name = "events_of_default_flag_7")
    private Boolean eventsOfDefaultFlag7;

    @Column(name = "events_of_default_flag_7_description")
    private String eventsOfDefaultFlag7Description;

    @Column(name = "events_of_default_flag_8")
    private Boolean eventsOfDefaultFlag8;

    @Column(name = "events_of_default_flag_8_description")
    private String eventsOfDefaultFlag8Description;

    @Column(name = "events_of_default_flag_9")
    private Boolean eventsOfDefaultFlag9;

    @Column(name = "events_of_default_flag_9_description")
    private String eventsOfDefaultFlag9Description;

    @Column(name = "events_of_default_flag_10")
    private Boolean eventsOfDefaultFlag10;

    @Column(name = "events_of_default_flag_10_description")
    private String eventsOfDefaultFlag10Description;

    @Column(name = "consequences_of_default_flag_1")
    private Boolean consequencesOfDefaultFlag1;

    @Column(name = "consequences_of_default_flag_1_description")
    private String consequencesOfDefaultFlag1Description;

    @Column(name = "consequences_of_default_flag_2")
    private Boolean consequencesOfDefaultFlag2;

    @Column(name = "consequences_of_default_flag_2_description")
    private String consequencesOfDefaultFlag2Description;

    @Column(name = "consequences_of_default_flag_3")
    private Boolean consequencesOfDefaultFlag3;

    @Column(name = "consequences_of_default_flag_3_description")
    private String consequencesOfDefaultFlag3Description;

    @Column(name = "consequences_of_default_flag_4")
    private Boolean consequencesOfDefaultFlag4;

    @Column(name = "consequences_of_default_flag_4_description")
    private String consequencesOfDefaultFlag4Description;

    @Column(name = "associated_rights")
    private String associatedRights;

    @Column(name = "business_plan")
    private String businessPlan;

    @Column(name = "dispute_resolution",columnDefinition = "TEXT")
    private String disputeResolution;

    @Column(name = "governing_law")
    private String governingLaw;

    @Column(name = "exclusivity",columnDefinition = "TEXT")
    private String exclusivity;

    @Column(name = "exclusivity_days")
    private String exclusivityDays;

    @Column(name = "accept_status")
    private Integer acceptStatus;
    @Column(name = "email_key")
    private String emailKey;

    @Column(name = "envelope_id")
    private String envelopeId;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "deleted_flag")
    private Boolean deletedFlag;

    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at",updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Version
    private Long version;

    @Column(name = "undertakings_repersentation",columnDefinition = "TEXT")
    private String underTakingsRepresentation;

    @Column(name = "approval_consent",columnDefinition = "TEXT")
    private String approvalConsent;

    @Column(name = "costs_expenses",columnDefinition = "TEXT")
    private String costExpenses;

    @Column(name = "confidentiality",columnDefinition = "TEXT")
    private String confidentiality;

    @Column(name = "due_dilglence",columnDefinition = "TEXT")
    private String dueDilgilence;

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

    public Integer getAcceptFlag() {
        return acceptFlag;
    }

    public void setAcceptFlag(Integer acceptFlag) {
        this.acceptFlag = acceptFlag;
    }

    public String getTermSheetNumber() {
        return termSheetNumber;
    }

    public void setTermSheetNumber(String termSheetNumber) {
        this.termSheetNumber = termSheetNumber;
    }

    public String getDateOfTermSheet() {
        return dateOfTermSheet;
    }

    public void setDateOfTermSheet(String dateOfTermSheet) {
        this.dateOfTermSheet = dateOfTermSheet;
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
    }

    public String getDefaultInterestOption() {
        return defaultInterestOption;
    }

    public void setDefaultInterestOption(String defaultInterestOption) {
        this.defaultInterestOption = defaultInterestOption;
    }

    public String getTransferByInvestor() {
        return transferByInvestor;
    }

    public void setTransferByInvestor(String transferByInvestor) {
        this.transferByInvestor = transferByInvestor;
    }

    public String getConditionToClosing() {
        return conditionToClosing;
    }

    public void setConditionToClosing(String conditionToClosing) {
        this.conditionToClosing = conditionToClosing;
    }

    public String getBusinessPlanCondition() {
        return businessPlanCondition;
    }

    public void setBusinessPlanCondition(String businessPlanCondition) {
        this.businessPlanCondition = businessPlanCondition;
    }

    public String getOtherMatters() {
        return otherMatters;
    }

    public void setOtherMatters(String otherMatters) {
        this.otherMatters = otherMatters;
    }

    public String getOtherShareHolders() {
        return otherShareHolders;
    }

    public void setOtherShareHolders(String otherShareHolders) {
        this.otherShareHolders = otherShareHolders;
    }

    public String getDebentureTrustee() {
        return debentureTrustee;
    }

    public void setDebentureTrustee(String debentureTrustee) {
        this.debentureTrustee = debentureTrustee;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getDepository() {
        return depository;
    }

    public void setDepository(String depository) {
        this.depository = depository;
    }

    public String getRegisterAndTransferAgent() {
        return registerAndTransferAgent;
    }

    public void setRegisterAndTransferAgent(String registerAndTransferAgent) {
        this.registerAndTransferAgent = registerAndTransferAgent;
    }

    public String getBusinessOfTheIssuer() {
        return businessOfTheIssuer;
    }

    public void setBusinessOfTheIssuer(String businessOfTheIssuer) {
        this.businessOfTheIssuer = businessOfTheIssuer;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    public String getIssueSize() {
        return issueSize;
    }

    public void setIssueSize(String issueSize) {
        this.issueSize = issueSize;
    }

    public Integer getDeemedDateAllotment() {
        return deemedDateAllotment;
    }

    public void setDeemedDateAllotment(Integer deemedDateAllotment) {
        this.deemedDateAllotment = deemedDateAllotment;
    }

    public String getCommitmentFee() {
        return commitmentFee;
    }

    public void setCommitmentFee(String commitmentFee) {
        this.commitmentFee = commitmentFee;
    }

    public String getVoluntaryPrepayment() {
        return voluntaryPrepayment;
    }

    public void setVoluntaryPrepayment(String voluntaryPrepayment) {
        this.voluntaryPrepayment = voluntaryPrepayment;
    }

    public String getRedemptionProvisions() {
        return redemptionProvisions;
    }

    public void setRedemptionProvisions(String redemptionProvisions) {
        this.redemptionProvisions = redemptionProvisions;
    }

    public Long getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(Long gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public String getGracePeriodDays() {
        return gracePeriodDays;
    }

    public void setGracePeriodDays(String gracePeriodDays) {
        this.gracePeriodDays = gracePeriodDays;
    }

    public String getGracePeriodWords() {
        return gracePeriodWords;
    }

    public void setGracePeriodWords(String gracePeriodWords) {
        this.gracePeriodWords = gracePeriodWords;
    }

    public String getDefaultInterest() {
        return defaultInterest;
    }

    public void setDefaultInterest(String defaultInterest) {
        this.defaultInterest = defaultInterest;
    }

    public String getDefaultInterestWords() {
        return defaultInterestWords;
    }

    public void setDefaultInterestWords(String defaultInterestWords) {
        this.defaultInterestWords = defaultInterestWords;
    }

    public Boolean getInformationFlag1() {
        return informationFlag1;
    }

    public void setInformationFlag1(Boolean informationFlag1) {
        this.informationFlag1 = informationFlag1;
    }

    public String getInformationFlag1Description() {
        return informationFlag1Description;
    }

    public void setInformationFlag1Description(String informationFlag1Description) {
        this.informationFlag1Description = informationFlag1Description;
    }

    public Boolean getInformationFlag2() {
        return informationFlag2;
    }

    public void setInformationFlag2(Boolean informationFlag2) {
        this.informationFlag2 = informationFlag2;
    }

    public String getInformationFlag2Description() {
        return informationFlag2Description;
    }

    public void setInformationFlag2Description(String informationFlag2Description) {
        this.informationFlag2Description = informationFlag2Description;
    }

    public Boolean getInformationFlag3() {
        return informationFlag3;
    }

    public void setInformationFlag3(Boolean informationFlag3) {
        this.informationFlag3 = informationFlag3;
    }

    public String getInformationFlag3Description() {
        return informationFlag3Description;
    }

    public void setInformationFlag3Description(String informationFlag3Description) {
        this.informationFlag3Description = informationFlag3Description;
    }

    public Boolean getInformationFlag4() {
        return informationFlag4;
    }

    public void setInformationFlag4(Boolean informationFlag4) {
        this.informationFlag4 = informationFlag4;
    }

    public String getInformationFlag4Description() {
        return informationFlag4Description;
    }

    public void setInformationFlag4Description(String informationFlag4Description) {
        this.informationFlag4Description = informationFlag4Description;
    }

    public Boolean getInformationFlag5() {
        return informationFlag5;
    }

    public void setInformationFlag5(Boolean informationFlag5) {
        this.informationFlag5 = informationFlag5;
    }

    public String getInformationFlag5Description() {
        return informationFlag5Description;
    }

    public void setInformationFlag5Description(String informationFlag5Description) {
        this.informationFlag5Description = informationFlag5Description;
    }

    public Boolean getInformationFlag6() {
        return informationFlag6;
    }

    public void setInformationFlag6(Boolean informationFlag6) {
        this.informationFlag6 = informationFlag6;
    }

    public String getInformationFlag6Description() {
        return informationFlag6Description;
    }

    public void setInformationFlag6Description(String informationFlag6Description) {
        this.informationFlag6Description = informationFlag6Description;
    }

    public Boolean getRestrictiveCovenantsFlag1() {
        return restrictiveCovenantsFlag1;
    }

    public void setRestrictiveCovenantsFlag1(Boolean restrictiveCovenantsFlag1) {
        this.restrictiveCovenantsFlag1 = restrictiveCovenantsFlag1;
    }

    public String getRestrictiveCovenantsFlag1Description() {
        return restrictiveCovenantsFlag1Description;
    }

    public void setRestrictiveCovenantsFlag1Description(String restrictiveCovenantsFlag1Description) {
        this.restrictiveCovenantsFlag1Description = restrictiveCovenantsFlag1Description;
    }

    public Boolean getRestrictiveCovenantsFlag2() {
        return restrictiveCovenantsFlag2;
    }

    public void setRestrictiveCovenantsFlag2(Boolean restrictiveCovenantsFlag2) {
        this.restrictiveCovenantsFlag2 = restrictiveCovenantsFlag2;
    }

    public String getRestrictiveCovenantsFlag2Description() {
        return restrictiveCovenantsFlag2Description;
    }

    public void setRestrictiveCovenantsFlag2Description(String restrictiveCovenantsFlag2Description) {
        this.restrictiveCovenantsFlag2Description = restrictiveCovenantsFlag2Description;
    }

    public Boolean getRestrictiveCovenantsFlag3() {
        return restrictiveCovenantsFlag3;
    }

    public void setRestrictiveCovenantsFlag3(Boolean restrictiveCovenantsFlag3) {
        this.restrictiveCovenantsFlag3 = restrictiveCovenantsFlag3;
    }

    public String getRestrictiveCovenantsFlag3Description() {
        return restrictiveCovenantsFlag3Description;
    }

    public void setRestrictiveCovenantsFlag3Description(String restrictiveCovenantsFlag3Description) {
        this.restrictiveCovenantsFlag3Description = restrictiveCovenantsFlag3Description;
    }

    public Boolean getRestrictiveCovenantsFlag4() {
        return restrictiveCovenantsFlag4;
    }

    public void setRestrictiveCovenantsFlag4(Boolean restrictiveCovenantsFlag4) {
        this.restrictiveCovenantsFlag4 = restrictiveCovenantsFlag4;
    }

    public String getRestrictiveCovenantsFlag4Description() {
        return restrictiveCovenantsFlag4Description;
    }

    public void setRestrictiveCovenantsFlag4Description(String restrictiveCovenantsFlag4Description) {
        this.restrictiveCovenantsFlag4Description = restrictiveCovenantsFlag4Description;
    }

    public Boolean getRestrictiveCovenantsFlag5() {
        return restrictiveCovenantsFlag5;
    }

    public void setRestrictiveCovenantsFlag5(Boolean restrictiveCovenantsFlag5) {
        this.restrictiveCovenantsFlag5 = restrictiveCovenantsFlag5;
    }

    public String getRestrictiveCovenantsFlag5Description() {
        return restrictiveCovenantsFlag5Description;
    }

    public void setRestrictiveCovenantsFlag5Description(String restrictiveCovenantsFlag5Description) {
        this.restrictiveCovenantsFlag5Description = restrictiveCovenantsFlag5Description;
    }

    public Boolean getEventsOfDefaultFlag1() {
        return eventsOfDefaultFlag1;
    }

    public void setEventsOfDefaultFlag1(Boolean eventsOfDefaultFlag1) {
        this.eventsOfDefaultFlag1 = eventsOfDefaultFlag1;
    }

    public String getEventsOfDefaultFlag1Description() {
        return eventsOfDefaultFlag1Description;
    }

    public void setEventsOfDefaultFlag1Description(String eventsOfDefaultFlag1Description) {
        this.eventsOfDefaultFlag1Description = eventsOfDefaultFlag1Description;
    }

    public Boolean getEventsOfDefaultFlag2() {
        return eventsOfDefaultFlag2;
    }

    public void setEventsOfDefaultFlag2(Boolean eventsOfDefaultFlag2) {
        this.eventsOfDefaultFlag2 = eventsOfDefaultFlag2;
    }

    public String getEventsOfDefaultFlag2Description() {
        return eventsOfDefaultFlag2Description;
    }

    public void setEventsOfDefaultFlag2Description(String eventsOfDefaultFlag2Description) {
        this.eventsOfDefaultFlag2Description = eventsOfDefaultFlag2Description;
    }

    public Boolean getEventsOfDefaultFlag3() {
        return eventsOfDefaultFlag3;
    }

    public void setEventsOfDefaultFlag3(Boolean eventsOfDefaultFlag3) {
        this.eventsOfDefaultFlag3 = eventsOfDefaultFlag3;
    }

    public String getEventsOfDefaultFlag3Description() {
        return eventsOfDefaultFlag3Description;
    }

    public void setEventsOfDefaultFlag3Description(String eventsOfDefaultFlag3Description) {
        this.eventsOfDefaultFlag3Description = eventsOfDefaultFlag3Description;
    }

    public Boolean getEventsOfDefaultFlag4() {
        return eventsOfDefaultFlag4;
    }

    public void setEventsOfDefaultFlag4(Boolean eventsOfDefaultFlag4) {
        this.eventsOfDefaultFlag4 = eventsOfDefaultFlag4;
    }

    public String getEventsOfDefaultFlag4Description() {
        return eventsOfDefaultFlag4Description;
    }

    public void setEventsOfDefaultFlag4Description(String eventsOfDefaultFlag4Description) {
        this.eventsOfDefaultFlag4Description = eventsOfDefaultFlag4Description;
    }

    public Boolean getEventsOfDefaultFlag5() {
        return eventsOfDefaultFlag5;
    }

    public void setEventsOfDefaultFlag5(Boolean eventsOfDefaultFlag5) {
        this.eventsOfDefaultFlag5 = eventsOfDefaultFlag5;
    }

    public String getEventsOfDefaultFlag5Description() {
        return eventsOfDefaultFlag5Description;
    }

    public void setEventsOfDefaultFlag5Description(String eventsOfDefaultFlag5Description) {
        this.eventsOfDefaultFlag5Description = eventsOfDefaultFlag5Description;
    }

    public Boolean getEventsOfDefaultFlag6() {
        return eventsOfDefaultFlag6;
    }

    public void setEventsOfDefaultFlag6(Boolean eventsOfDefaultFlag6) {
        this.eventsOfDefaultFlag6 = eventsOfDefaultFlag6;
    }

    public String getEventsOfDefaultFlag6Description() {
        return eventsOfDefaultFlag6Description;
    }

    public void setEventsOfDefaultFlag6Description(String eventsOfDefaultFlag6Description) {
        this.eventsOfDefaultFlag6Description = eventsOfDefaultFlag6Description;
    }

    public Boolean getEventsOfDefaultFlag7() {
        return eventsOfDefaultFlag7;
    }

    public void setEventsOfDefaultFlag7(Boolean eventsOfDefaultFlag7) {
        this.eventsOfDefaultFlag7 = eventsOfDefaultFlag7;
    }

    public String getEventsOfDefaultFlag7Description() {
        return eventsOfDefaultFlag7Description;
    }

    public void setEventsOfDefaultFlag7Description(String eventsOfDefaultFlag7Description) {
        this.eventsOfDefaultFlag7Description = eventsOfDefaultFlag7Description;
    }

    public Boolean getEventsOfDefaultFlag8() {
        return eventsOfDefaultFlag8;
    }

    public void setEventsOfDefaultFlag8(Boolean eventsOfDefaultFlag8) {
        this.eventsOfDefaultFlag8 = eventsOfDefaultFlag8;
    }

    public String getEventsOfDefaultFlag8Description() {
        return eventsOfDefaultFlag8Description;
    }

    public void setEventsOfDefaultFlag8Description(String eventsOfDefaultFlag8Description) {
        this.eventsOfDefaultFlag8Description = eventsOfDefaultFlag8Description;
    }

    public Boolean getEventsOfDefaultFlag9() {
        return eventsOfDefaultFlag9;
    }

    public void setEventsOfDefaultFlag9(Boolean eventsOfDefaultFlag9) {
        this.eventsOfDefaultFlag9 = eventsOfDefaultFlag9;
    }

    public String getEventsOfDefaultFlag9Description() {
        return eventsOfDefaultFlag9Description;
    }

    public void setEventsOfDefaultFlag9Description(String eventsOfDefaultFlag9Description) {
        this.eventsOfDefaultFlag9Description = eventsOfDefaultFlag9Description;
    }

    public Boolean getEventsOfDefaultFlag10() {
        return eventsOfDefaultFlag10;
    }

    public void setEventsOfDefaultFlag10(Boolean eventsOfDefaultFlag10) {
        this.eventsOfDefaultFlag10 = eventsOfDefaultFlag10;
    }

    public String getEventsOfDefaultFlag10Description() {
        return eventsOfDefaultFlag10Description;
    }

    public void setEventsOfDefaultFlag10Description(String eventsOfDefaultFlag10Description) {
        this.eventsOfDefaultFlag10Description = eventsOfDefaultFlag10Description;
    }

    public Boolean getConsequencesOfDefaultFlag1() {
        return consequencesOfDefaultFlag1;
    }

    public void setConsequencesOfDefaultFlag1(Boolean consequencesOfDefaultFlag1) {
        this.consequencesOfDefaultFlag1 = consequencesOfDefaultFlag1;
    }

    public String getConsequencesOfDefaultFlag1Description() {
        return consequencesOfDefaultFlag1Description;
    }

    public void setConsequencesOfDefaultFlag1Description(String consequencesOfDefaultFlag1Description) {
        this.consequencesOfDefaultFlag1Description = consequencesOfDefaultFlag1Description;
    }

    public Boolean getConsequencesOfDefaultFlag2() {
        return consequencesOfDefaultFlag2;
    }

    public void setConsequencesOfDefaultFlag2(Boolean consequencesOfDefaultFlag2) {
        this.consequencesOfDefaultFlag2 = consequencesOfDefaultFlag2;
    }

    public String getConsequencesOfDefaultFlag2Description() {
        return consequencesOfDefaultFlag2Description;
    }

    public void setConsequencesOfDefaultFlag2Description(String consequencesOfDefaultFlag2Description) {
        this.consequencesOfDefaultFlag2Description = consequencesOfDefaultFlag2Description;
    }

    public Boolean getConsequencesOfDefaultFlag3() {
        return consequencesOfDefaultFlag3;
    }

    public void setConsequencesOfDefaultFlag3(Boolean consequencesOfDefaultFlag3) {
        this.consequencesOfDefaultFlag3 = consequencesOfDefaultFlag3;
    }

    public String getConsequencesOfDefaultFlag3Description() {
        return consequencesOfDefaultFlag3Description;
    }

    public void setConsequencesOfDefaultFlag3Description(String consequencesOfDefaultFlag3Description) {
        this.consequencesOfDefaultFlag3Description = consequencesOfDefaultFlag3Description;
    }

    public Boolean getConsequencesOfDefaultFlag4() {
        return consequencesOfDefaultFlag4;
    }

    public void setConsequencesOfDefaultFlag4(Boolean consequencesOfDefaultFlag4) {
        this.consequencesOfDefaultFlag4 = consequencesOfDefaultFlag4;
    }

    public String getConsequencesOfDefaultFlag4Description() {
        return consequencesOfDefaultFlag4Description;
    }

    public void setConsequencesOfDefaultFlag4Description(String consequencesOfDefaultFlag4Description) {
        this.consequencesOfDefaultFlag4Description = consequencesOfDefaultFlag4Description;
    }

    public String getAssociatedRights() {
        return associatedRights;
    }

    public void setAssociatedRights(String associatedRights) {
        this.associatedRights = associatedRights;
    }

    public String getBusinessPlan() {
        return businessPlan;
    }

    public void setBusinessPlan(String businessPlan) {
        this.businessPlan = businessPlan;
    }

    public String getDisputeResolution() {
        return disputeResolution;
    }

    public void setDisputeResolution(String disputeResolution) {
        this.disputeResolution = disputeResolution;
    }

    public String getGoverningLaw() {
        return governingLaw;
    }

    public void setGoverningLaw(String governingLaw) {
        this.governingLaw = governingLaw;
    }

    public String getExclusivity() {
        return exclusivity;
    }

    public void setExclusivity(String exclusivity) {
        this.exclusivity = exclusivity;
    }

    public String getExclusivityDays() {
        return exclusivityDays;
    }

    public void setExclusivityDays(String exclusivityDays) {
        this.exclusivityDays = exclusivityDays;
    }

    public Integer getAcceptStatus() {
        return acceptStatus;
    }

    public void setAcceptStatus(Integer acceptStatus) {
        this.acceptStatus = acceptStatus;
    }

    public String getEmailKey() {
        return emailKey;
    }

    public void setEmailKey(String emailKey) {
        this.emailKey = emailKey;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getUnderTakingsRepresentation() {
        return underTakingsRepresentation;
    }

    public void setUnderTakingsRepresentation(String underTakingsRepresentation) {
        this.underTakingsRepresentation = underTakingsRepresentation;
    }

    public String getApprovalConsent() {
        return approvalConsent;
    }

    public void setApprovalConsent(String approvalConsent) {
        this.approvalConsent = approvalConsent;
    }

    public String getCostExpenses() {
        return costExpenses;
    }

    public void setCostExpenses(String costExpenses) {
        this.costExpenses = costExpenses;
    }

    public String getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(String confidentiality) {
        this.confidentiality = confidentiality;
    }

    public String getDueDilgilence() {
        return dueDilgilence;
    }

    public void setDueDilgilence(String dueDilgilence) {
        this.dueDilgilence = dueDilgilence;
    }
}