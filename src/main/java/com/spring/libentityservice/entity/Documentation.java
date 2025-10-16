package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "documentation")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Documentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @Column(name = "dd_partner")
    private String ddPartner;

    @Column(name = "dd_observation")
    @Convert(converter = StringListConverter.class)
    private List<String> ddObservation;

//    Transation Document

    @Column(name = "share_pledge_aggreement")
    private Integer sharePledgeAggreement;

    @Column(name = "corporate_gurantee")
    private Integer corporateGurantee;

    @Column(name = "personal_gurantee")
    private Integer personalGurantee;

    @Column(name = "deed_of_hypothetication")
    private Integer deedOfHypothetication;

    @Column(name = "debenture_trustee_deed")
    private Integer debentureTrusteeDeed;

    @Column(name = "debenture_trustee_agreement")
    private Integer debentureTrusteeAggreement;

    @Column(name = "hypothetication_power_of_attorney")
    private Integer hypotheticationPower;

    @Column(name = "pledge_power_of_attorney")
    private Integer pledgePowerOfAttorney;

    @Column(name = "escrow_aggreement")
    private Integer escrowAggreement;

    @Column(name = "investment_aggreement")
    private Integer investmentAggreement;

    @Column(name = "warrant_subscription_aggreement")
    private Integer warrantSubscription;

    @Column(name = "indemity_deed")
    private Integer indemityDeed;

    @Column(name = "letter_of_comfo")
    private Integer letteOfComfo;


//    AncilliaryDocuments

    @Column(name = "dpn")
    private Integer dpn;

    @Column(name = "loc")
    private Integer loc;

    @Column(name = "directors_certificate")
    private Integer directorsCertificate;

    @Column(name = "debenture_issunance_notice")
    private Integer debentureIssunanceNotice;

    @Column(name = "custody_conformation_from_debenture")
    private Integer customerConformation;

    @Column(name = "banker_consent")
    private Integer bankerConstent;

    @Column(name = "demat_statement")
    private Integer dematStatement;

    @Column(name = "physical_shares")
    private Integer physicalShares;

    @Column(name = "annexture")
    private Integer annexture;

    @Column(name = "pas3_with_payment_recipt")
    private Integer pas3WithPaymentRecipt;

    @Column(name = "board_resolution")
    private Integer boardResolution;

    @Column(name = "demat_allocation")
    private Integer dematAllocation;

    @Column(name = "ca_certificate")
    private Integer caCertificate;

    @Column(name = "chg9")
    private Integer chg9;

    @Column(name = "br_for_inssurance")
    private Integer brForInssurance;

    @Column(name = "networth_certificate")
    private Integer networthCrtificatione;

    @Column(name = "pdc_decleration")
    private Integer pdcDeclaration;

    @Column(name = "MGT14_filedalongwithpaymentchallan")
    private Integer mGT14;

    @Column(name = "PAS4PPOL")
    private Integer pas4ppol;

    @Column(name = "debenture_trustee_offer_letter")
    private Integer debentureTrusteeOfferLetter;

    @Column(name = "condition_precedent")
    private Integer conditionPrecedent;

    @Column(name = "signature_verification")
    private Integer signatureVerification;

    @Column(name = "chg1")
    private Integer chg1;

    @Column(name = "end_use_certificate")
    private Integer endUseCertificate;

    @Column(name = "rta_appointment")
    private Integer rtaAppointment;

    @Column(name = "pledge_confirmation")
    private Integer pledgeConfirmation;

    @Column(name = "sr_for_issuance_of_debentures")
    private Integer srForIssuanceOfDebentures;

    @Column(name = "br_for_right_to_invest")
    private Integer brForRightToInvest;

    @Column(name = "escrow_account_details")
    private Integer escrowAccountDetails;

    @Column(name = "is_active", columnDefinition = "TRUE")
    private boolean isActive;

    @Column(name = "deleted_flag", columnDefinition = "FALSE")
    private boolean deletedFlag;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "tab")
    private String tab;

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

    public String getDdPartner() {
        return ddPartner;
    }

    public void setDdPartner(String ddPartner) {
        this.ddPartner = ddPartner;
    }

    public List<String> getDdObservation() {
        return ddObservation;
    }

    public void setDdObservation(List<String> ddObservation) {
        this.ddObservation = ddObservation;
    }

    public Integer getSharePledgeAggreement() {
        return sharePledgeAggreement;
    }

    public void setSharePledgeAggreement(Integer sharePledgeAggreement) {
        this.sharePledgeAggreement = sharePledgeAggreement;
    }

    public Integer getCorporateGurantee() {
        return corporateGurantee;
    }

    public void setCorporateGurantee(Integer corporateGurantee) {
        this.corporateGurantee = corporateGurantee;
    }

    public Integer getPersonalGurantee() {
        return personalGurantee;
    }

    public void setPersonalGurantee(Integer personalGurantee) {
        this.personalGurantee = personalGurantee;
    }

    public Integer getDeedOfHypothetication() {
        return deedOfHypothetication;
    }

    public void setDeedOfHypothetication(Integer deedOfHypothetication) {
        this.deedOfHypothetication = deedOfHypothetication;
    }

    public Integer getDebentureTrusteeDeed() {
        return debentureTrusteeDeed;
    }

    public void setDebentureTrusteeDeed(Integer debentureTrusteeDeed) {
        this.debentureTrusteeDeed = debentureTrusteeDeed;
    }

    public Integer getDebentureTrusteeAggreement() {
        return debentureTrusteeAggreement;
    }

    public void setDebentureTrusteeAggreement(Integer debentureTrusteeAggreement) {
        this.debentureTrusteeAggreement = debentureTrusteeAggreement;
    }

    public Integer getHypotheticationPower() {
        return hypotheticationPower;
    }

    public void setHypotheticationPower(Integer hypotheticationPower) {
        this.hypotheticationPower = hypotheticationPower;
    }

    public Integer getPledgePowerOfAttorney() {
        return pledgePowerOfAttorney;
    }

    public void setPledgePowerOfAttorney(Integer pledgePowerOfAttorney) {
        this.pledgePowerOfAttorney = pledgePowerOfAttorney;
    }

    public Integer getEscrowAggreement() {
        return escrowAggreement;
    }

    public void setEscrowAggreement(Integer escrowAggreement) {
        this.escrowAggreement = escrowAggreement;
    }

    public Integer getInvestmentAggreement() {
        return investmentAggreement;
    }

    public void setInvestmentAggreement(Integer investmentAggreement) {
        this.investmentAggreement = investmentAggreement;
    }

    public Integer getWarrantSubscription() {
        return warrantSubscription;
    }

    public void setWarrantSubscription(Integer warrantSubscription) {
        this.warrantSubscription = warrantSubscription;
    }

    public Integer getIndemityDeed() {
        return indemityDeed;
    }

    public void setIndemityDeed(Integer indemityDeed) {
        this.indemityDeed = indemityDeed;
    }

    public Integer getLetteOfComfo() {
        return letteOfComfo;
    }

    public void setLetteOfComfo(Integer letteOfComfo) {
        this.letteOfComfo = letteOfComfo;
    }

    public Integer getDpn() {
        return dpn;
    }

    public void setDpn(Integer dpn) {
        this.dpn = dpn;
    }

    public Integer getLoc() {
        return loc;
    }

    public void setLoc(Integer loc) {
        this.loc = loc;
    }

    public Integer getDirectorsCertificate() {
        return directorsCertificate;
    }

    public void setDirectorsCertificate(Integer directorsCertificate) {
        this.directorsCertificate = directorsCertificate;
    }

    public Integer getDebentureIssunanceNotice() {
        return debentureIssunanceNotice;
    }

    public void setDebentureIssunanceNotice(Integer debentureIssunanceNotice) {
        this.debentureIssunanceNotice = debentureIssunanceNotice;
    }

    public Integer getCustomerConformation() {
        return customerConformation;
    }

    public void setCustomerConformation(Integer customerConformation) {
        this.customerConformation = customerConformation;
    }

    public Integer getBankerConstent() {
        return bankerConstent;
    }

    public void setBankerConstent(Integer bankerConstent) {
        this.bankerConstent = bankerConstent;
    }

    public Integer getDematStatement() {
        return dematStatement;
    }

    public void setDematStatement(Integer dematStatement) {
        this.dematStatement = dematStatement;
    }

    public Integer getPhysicalShares() {
        return physicalShares;
    }

    public void setPhysicalShares(Integer physicalShares) {
        this.physicalShares = physicalShares;
    }

    public Integer getAnnexture() {
        return annexture;
    }

    public void setAnnexture(Integer annexture) {
        this.annexture = annexture;
    }

    public Integer getPas3WithPaymentRecipt() {
        return pas3WithPaymentRecipt;
    }

    public void setPas3WithPaymentRecipt(Integer pas3WithPaymentRecipt) {
        this.pas3WithPaymentRecipt = pas3WithPaymentRecipt;
    }

    public Integer getBoardResolution() {
        return boardResolution;
    }

    public void setBoardResolution(Integer boardResolution) {
        this.boardResolution = boardResolution;
    }

    public Integer getDematAllocation() {
        return dematAllocation;
    }

    public void setDematAllocation(Integer dematAllocation) {
        this.dematAllocation = dematAllocation;
    }

    public Integer getCaCertificate() {
        return caCertificate;
    }

    public void setCaCertificate(Integer caCertificate) {
        this.caCertificate = caCertificate;
    }

    public Integer getChg9() {
        return chg9;
    }

    public void setChg9(Integer chg9) {
        this.chg9 = chg9;
    }

    public Integer getBrForInssurance() {
        return brForInssurance;
    }

    public void setBrForInssurance(Integer brForInssurance) {
        this.brForInssurance = brForInssurance;
    }

    public Integer getNetworthCrtificatione() {
        return networthCrtificatione;
    }

    public void setNetworthCrtificatione(Integer networthCrtificatione) {
        this.networthCrtificatione = networthCrtificatione;
    }

    public Integer getPdcDeclaration() {
        return pdcDeclaration;
    }

    public void setPdcDeclaration(Integer pdcDeclaration) {
        this.pdcDeclaration = pdcDeclaration;
    }

    public Integer getmGT14() {
        return mGT14;
    }

    public void setmGT14(Integer mGT14) {
        this.mGT14 = mGT14;
    }

    public Integer getPas4ppol() {
        return pas4ppol;
    }

    public void setPas4ppol(Integer pas4ppol) {
        this.pas4ppol = pas4ppol;
    }

    public Integer getDebentureTrusteeOfferLetter() {
        return debentureTrusteeOfferLetter;
    }

    public void setDebentureTrusteeOfferLetter(Integer debentureTrusteeOfferLetter) {
        this.debentureTrusteeOfferLetter = debentureTrusteeOfferLetter;
    }

    public Integer getConditionPrecedent() {
        return conditionPrecedent;
    }

    public void setConditionPrecedent(Integer conditionPrecedent) {
        this.conditionPrecedent = conditionPrecedent;
    }

    public Integer getSignatureVerification() {
        return signatureVerification;
    }

    public void setSignatureVerification(Integer signatureVerification) {
        this.signatureVerification = signatureVerification;
    }

    public Integer getChg1() {
        return chg1;
    }

    public void setChg1(Integer chg1) {
        this.chg1 = chg1;
    }

    public Integer getEndUseCertificate() {
        return endUseCertificate;
    }

    public void setEndUseCertificate(Integer endUseCertificate) {
        this.endUseCertificate = endUseCertificate;
    }

    public Integer getRtaAppointment() {
        return rtaAppointment;
    }

    public void setRtaAppointment(Integer rtaAppointment) {
        this.rtaAppointment = rtaAppointment;
    }

    public Integer getPledgeConfirmation() {
        return pledgeConfirmation;
    }

    public void setPledgeConfirmation(Integer pledgeConfirmation) {
        this.pledgeConfirmation = pledgeConfirmation;
    }

    public Integer getSrForIssuanceOfDebentures() {
        return srForIssuanceOfDebentures;
    }

    public void setSrForIssuanceOfDebentures(Integer srForIssuanceOfDebentures) {
        this.srForIssuanceOfDebentures = srForIssuanceOfDebentures;
    }

    public Integer getBrForRightToInvest() {
        return brForRightToInvest;
    }

    public void setBrForRightToInvest(Integer brForRightToInvest) {
        this.brForRightToInvest = brForRightToInvest;
    }

    public Integer getEscrowAccountDetails() {
        return escrowAccountDetails;
    }

    public void setEscrowAccountDetails(Integer escrowAccountDetails) {
        this.escrowAccountDetails = escrowAccountDetails;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(boolean deletedFlag) {
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

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }
}
