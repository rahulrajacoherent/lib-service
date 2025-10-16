package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "loi_generation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class LoiGeneration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @ManyToOne
    @JoinColumn(name = "subscriber")
    private FundDetails subscriber;

    @OneToMany(mappedBy = "loiGeneration",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<TrancheDetails> trancheDetails;

    @Column(name = "rated_flag")
    private Integer ratedFlag;

    @Column(name = "founder")
    private String founder;

    @Column(name = "gurantor")
    private String gurantor;


    @Column(name = "upfront_coupon_per")
    private String upfrontCouponPer;

    @Column(name = "upfront_coupon_investment")
    private String upfrontCouponInvestment;

    @Column(name = "upfront_coupon_split")
    private Integer upfrontCouponSplit;

    @Column(name = "upfront_coupon_termsheet")
    private double upfrontCouponTermSheet;

    @Column(name = "upfront_coupon_disbursement")
    private double upfrontCouponDisbursement;

    @Column(name = "valuation")
    private String valuation;

    @Column(name = "valuation_in_words")
    private String valuationInWords;

    @Column(name = "coupon_type")
    private String couponType;

    @Column(name = "loi_type")
    private String loiType;

    @Column(name = "secured_flag")
    private Integer securedFlag;

    @Column(name = "listed_flag")
    private Integer listedFlag;

    @Column(name = "investment_amount")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(investment_amount),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String investmentAmount;

    @Column(name = "investment_amount_in_words")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(investment_amount_in_words),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String investmentAmountInWords;

    @Column(name = "investment_notes")
    private String investmentNotes;

    @Column(name = "tenor")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(tenor),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private Long tenor;

    @Column(name = "tenor_period_type")
    private String tenorPeriodType;

    @Column(name = "due_date")
    private String dueDate;

    @Column(name = "lock_in_period")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(lock_in_period),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String lockInPeriod;
    //coupon

    @Column(name = "coupon")
    private String coupon;

    @Column(name = "periodicity")
    private String periodicity;

    @Column(name = "coupon_percentage")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(coupon_percentage),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String couponPer;

    @Column(name = "upfront_coupon")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(upfront_coupon),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String upfrontCoupon;

    @Column(name = "coupon_only_days")
    private String couponOnlyDays;

    //redemption
    @Column(name = "redemption_coupon")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(redemption_coupon),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String redemptionCoupon;

    @Column(name = "redemption_coupon_per")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(redemption_coupon_per),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String redemptionCouponPer;

    @Column(name = "end_use")
    private String endUse;

    //prepayment
    @Column(name = "prepayment")
    private String prepayment;

    @Column(name = "days_for_prepayment")
    private String daysForPrepayment;

    @Column(name = "per_for_prepayment")
    private String perForPrepayment;

    //investment in units
    @Column(name = "right_to_invest_flag")
    private Integer rightOfInvestFlag;

    @Column(name = "security_flag")
    private Integer securityFlag;

    @Column(name = "right_to_invest")
    private String rightOfInvest;

    @Column(name = "right_to_invest_in_words")
    private String rightOfInvestInWord;

    //security
    @Column(name = "hypothecation")
    private String hypothecation;

    @Column(name = "seniority")
    private String seniority;

    @Column(name = "seniority_data_flag1")
    private int seniorityFlag1;

    @Column(name = "seniority_data_flag2")
    private int seniorityFlag2;

    @Column(name = "personal_guarantee")
    private String personalGuarantee;

    @Column(name = "select_personal_guarantee",columnDefinition = "TEXT")
    private String selectPersonalGuarantee;

    @Column(name = "personal_guarantee_company",columnDefinition = "TEXT")
    private String personalGuaranteeCompany;

    @Column(name = "personal_guarantee_other_company",columnDefinition = "TEXT")
    private String personalGuaranteeOtherCompany;

    @Column(name = "other_personal_guarantee",columnDefinition = "TEXT")
    private String otherPersonalGuarantee;

    @Column(name = "corporate_guarantee")
    private String corporateGuarantee;

    @Column(name = "corporate_guarantee_name",columnDefinition = "TEXT")
    private String corporateGuaranteeName;

    @Column(name = "corporate_guarantee_company",columnDefinition = "TEXT")
    private String corporateGuaranteeCompany;

    @Column(name = "corporate_guarantee_other_company",columnDefinition = "TEXT")
    private String corporateGuaranteeOtherCompany;

    @Column(name = "security_description")
    private String securityDescription;

    //pledge_of_share

    @Column(name = "pledge_of_share")
    private Integer pledgeOfShare;

    @Column(name = "escrow")
    private String escrow;

    @Column(name = "type_of_sales")
    private String typeOfSales;

    @Column(name = "security_points")
    private String addSecurityPts;

    @Column(name = "repayment_type")
    private String repaymentType;

    @Column(name = "specific_conditions")
    private String specialConditions;

    @Column(name = "equity_investment")
    private String equityInvestment;

    @Column(name = "cash_collateral")
    private String cashCollateral;


    @Column(name = "callorright_invest_description")
    private String callorrightInvestDescription;

    @Column(name = "cash_collateral_value")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(cash_collateral_value),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String cashCollateralValue;

    //expenses
    @Column(name = "expense_ceilling")
    private String expenseCeil;

    @Column(name = "expense_amount")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(expense_amount),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String expenseDescription;

    @Column(name = "other_terms_and_conditions",columnDefinition = "TEXT")
    private String otherTermsAndConditions;

    @Column(name = "other_terms_and_conditions_2")
    private String otherTermsAndConditions2;

    @Column(name = "other_terms_and_conditions_3")
    private String otherTermsAndConditions3;

    @Column(name = "accept_status")
    private Integer acceptStatus;

    @Column(name = "accept_flag")
    private Integer acceptFlag;

    @Column(name = "emailkey")
    private String emailkey;

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

    @Column(name = "limited_resource_comment")
    private String limitedResourceComment;

    @Column(name = "edit_flag")
    private Boolean editFlag;

    @Column(name = "tenor_equity")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(tenor_equity),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String tenorEquity;

    @Column(name = "right_to_invest_companyname",columnDefinition = "TEXT")
    private String rightOfInvestCompanyName;

    @Column(name = "right_to_invest_other_companyname",columnDefinition = "TEXT")
    private String rightOfInvestOtherCompanyName;

    @Column(name = "holding_coupon")
    private Integer holdingCoupon;

    @Column(name = "mandatory_flag")
    private Integer mandatoryFlag;

    @Column(name = "holding_coupon_description",columnDefinition = "TEXT")
    private String holdingCouponDescription;

    @Column(name = "holding_coupon_percentage",columnDefinition = "TEXT")
    private String holdingCouponprecentage;

    @Column(name = "mortgage")
    private String mortgage;

    @Column(name = "mortgage_description",columnDefinition = "TEXT")
    private String mortgageDescription;

    @Column(name = "instrument_type")
    private String instrumentType;

    @Column(name = "other_security_point1",columnDefinition = "TEXT")
    private String otherSecurityPointone;

    @Column(name = "other_security_point2",columnDefinition = "TEXT")
    private String otherSecurityPointtwo;

    @Column(name = "coupon_moratorium")
    private Integer couponMoratorium;

    @Column(name = "coupon_moratorium_days")
    private String couponMoratoriumDays;

    @Column(name = "redemption_days")
    private String redemptionDays;

    @Column(name = "redemption_flag")
    private Integer redemptionFlag;

    @Column(name = "outstanding_investment_mount")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(outstanding_investment_mount),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String outStandingInvestmentAmount;

    @Column(name = "initial_investment_date")
    private String initialinvestmentDate;

    @Column(name = "maturitydate")
    private String maturityDate;

    @PrePersist
    public void prePersist() {
        this.isActive = Boolean.TRUE;
        this.deletedFlag = Boolean.FALSE;
    }
}
