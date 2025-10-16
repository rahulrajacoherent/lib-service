package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "company_details")
public class CompanyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "generated_company_id")
    private String generatedCompanyId;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(company_name),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "company_name")
    private String companyName;


    @Column(name = "company_address",columnDefinition = "TEXT")
    private String companyAddress;

    @Column(name = "district")
    private String district;

    @ManyToOne
    @JoinColumn(name = "state")
    private MnemonicMasterNew state;

    @Column(name = "pin_code")
    private String pinCode;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(cin_number),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "cin_number")
    private String cinNumber;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(company_phone_no),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "company_phone_no")
    private String companyPhoneNumber;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(primary_mail),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "primary_mail")
    private String primaryMail;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(communication_details_name),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "communication_details_name")
    private String communicationDetailsName;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(secondary_mail),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "secondary_mail")
    private String secondaryMail;

    @ManyToOne
    @JoinColumn(name = "industry")
    private MnemonicMasterNew industry;

    @Column(name = "gst_number")
    private String gstNumber;

    @Column(name = "city")
    private String city;


    @Column(name = "is_active")
    private Boolean isActive;

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

    @Column(name = "docusign_user_id")
    private String docusignUserId;
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

    public String getGeneratedCompanyId() {
        return generatedCompanyId;
    }

    public void setGeneratedCompanyId(String generatedCompanyId) {
        this.generatedCompanyId = generatedCompanyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public MnemonicMasterNew getState() {
        return state;
    }

    public void setState(MnemonicMasterNew state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCinNumber() {
        return cinNumber;
    }

    public void setCinNumber(String cinNumber) {
        this.cinNumber = cinNumber;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String getPrimaryMail() {
        return primaryMail;
    }

    public void setPrimaryMail(String primaryMail) {
        this.primaryMail = primaryMail;
    }

    public String getCommunicationDetailsName() {
        return communicationDetailsName;
    }

    public void setCommunicationDetailsName(String communicationDetailsName) {
        this.communicationDetailsName = communicationDetailsName;
    }

    public String getSecondaryMail() {
        return secondaryMail;
    }

    public void setSecondaryMail(String secondaryMail) {
        this.secondaryMail = secondaryMail;
    }

    public MnemonicMasterNew getIndustry() {
        return industry;
    }

    public void setIndustry(MnemonicMasterNew industry) {
        this.industry = industry;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getDocusignUserId() {
        return docusignUserId;
    }

    public void setDocusignUserId(String docusignUserId) {
        this.docusignUserId = docusignUserId;
    }
}
