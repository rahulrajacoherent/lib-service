package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "update_commercials")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateCommercials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @Column(name = "type_of_transaction")
    private String typeOfTransaction;

    @Column(name = "consideration_amount")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(consideration_amount),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String considerationAmount;

    @Column(name = "tenor_flag")
    private Integer tenorFlag;

    @Column(name = "tenor_period_type")
    private String tenorPeriodType;

    @Column(name = "tenor")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(tenor),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private Long tenor;

    @Column(name = "lock_in_period")
    private String lockInPeriod;

    @Column(name = "coupon_flag")
    private Integer couponFlag;

    @Column(name = "coupon_type")
    private String couponType;

    @Column(name = "coupon")
    private String coupon;

    @Column(name = "periodicity")
    private String periodicity;

    @Column(name = "coupon_percentage")
    private String couponPercentage;

    @Column(name = "upfront_flag")
    private Integer upfrontFlag;

    @Column(name = "upfront_investment")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(upfront_investment),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String upfrontInvestment;

    @Column(name = "upfront_percentage")
    private String upfrontPercentage;

    @Column(name = "upfront_coupon_split")
    private Integer upfrontCouponSplit;

    @Column(name = "termsheet_percentage")
    private double termsheetPercentage;

    @Column(name = "disbursement_percentage")
    private double disbursementPercentage;

    @Column(name = "redemption_flag")
    private Integer redemptionFlag;

    @Column(name = "tranche_details_flag")
    private Integer trancheDetailsFlag;

    @Column(name = "redemption_coupon")
    private String redemptionCoupon;

    @Column(name = "redemption_coupon_percentage")
    private String redemptionCouponPercentage;

    @Column(name = "redemption_provison_flag")
    private Integer redemptionProvisonFlag;

    @Column(name = "redemption_provison")
    private String redemptionType;

    @Column(name = "security_flag")
    private Integer securityFlag;

    @Column(name = "hypothetication_flag")
    private String hypothetication;

    @Column(name = "mortage")
    private String mortage;

    @Column(name = "mortgage_description",columnDefinition = "TEXT")
    private String mortgageDescription;

    @Column(name = "personal_gurantee")
    private String personalGurantee;

    @Column(name = "limited_resource_comment")
    private String limitedResourceComment;

    @Column(name = "corporate_guarantee")
    private String corporateGuarantee;

    @Column(name = "pledge_of_share")
    private Integer pledgeOfShare;

    @Column(name = "escrow")
    private String escrow;

    @Column(name = "escrow_description",columnDefinition = "TEXT")
    private String escrowDescription;

    @Column(name = "security_points_flag")
    private Integer securityPointFlag;

    @Column(name = "security_points",columnDefinition = "TEXT")
    private String addSecurityPts;

    @Column(name = "cash_collateral")
    private String cashCollateral;

    @Column(name = "cash_collateral_value")
    private String cashCollateralValue;

    @Column(name = "other_security_points_1")
    private String otherSecurityPoints1;

    @Column(name = "other_security_points_2")
    private String otherSecurityPoints2;

    @Column(name = "special_condition_flag")
    private Integer specialConditionsFlag;

    @Column(name = "specific_conditions",columnDefinition = "TEXT")
    private String specialConditions;

    @Column(name = "select_personal_guarantee",columnDefinition = "TEXT")
    private String selectPersonalGuarantee;

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
    @Column(name = "updated_at")
    private Timestamp modifiedAt;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long modifiedBy;

    @Column(name = "amount_flag")
    private Integer amountFlag;

    @Column(name = "redemption_days")
    private String redemptionDays;

    @Column(name = "redemption_day_flag")
    private Integer redemptionDayFlag;


    @Column(name = "grace_period")
    private Long gracePeriod;

    @Column(name = "grace_period_days")
    private String gracePeriodDays;

    @Column(name = "grace_period_words")
    private String gracePeriodWords;

    @Column(name = "security_description")
    private String securityDescription;
}
