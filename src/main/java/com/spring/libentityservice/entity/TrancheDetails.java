package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "tranche_details")
@Getter
@Setter
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class TrancheDetails {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @Column(name = "tranche")
    private Integer tranche;

    @Column(name = "investment_value")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(investment_value),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private Double investmentValue;

    @Column(name = "uc_investment_value")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(uc_investment_value),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private Double uCInvestmentValue;

    @Column(name = "maturity_period_or_tenor")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(maturity_period_or_tenor),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private Long maturityPeriodOrTenor;

    @Column(name = "uc_maturity_period_or_tenor")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(uc_maturity_period_or_tenor),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private Long uCMaturityPeriodOrTenor;

    @Column(name = "tranche_status")
    private String trancheStatus;

    @Column(name = "transferred_date_and_time")
    private String transferredDateAndTime;

    @Column(name = "expected_transfer_date")
    private String expectedTransferDate;

    @Column(name = "transaction_reference_number")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(transaction_reference_number),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String transactionReferenceNumber;

    @Column(name = "rejected_comment",columnDefinition = "TEXT")
    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(rejected_comment),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    private String rejectedComment;

    @Column(name = "type")
    private String type;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "deleted_flag")
    private Boolean deletedFlag;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "modified_by")
    private Integer modifiedBy;

    @Column(name = "due_day")
    private String dueDay;

    @Column(name = "time_frame")
    private Integer timeFrame;

    @Column(name = "uc_time_frame")
    private Integer uCTimeFrame;

    @Column(name = "advance_notice")
    private Integer advanceNotice;

    @Column(name = "uc_advance_notice")
    private Integer uCAdvanceNotice;

    @Column(name = "applicable_flag")
    private Integer editFlag;

    @Column(name = "holding_coupon_update_flag")
    private Integer holdingCouponUpdateFlag;

    @ManyToOne
    @JoinColumn(name = "loi_generation_id")
    @JsonBackReference
    private LoiGeneration loiGeneration;

    @ManyToOne
    @JoinColumn(name = "updated_commercials_id_fk")
    private UpdateCommercials updateCommercials;

    @PrePersist
    private void prePersist() {
        if (this.isActive == null) {
            this.isActive = Boolean.TRUE;
        }
        if (this.deletedFlag == null) {
            this.deletedFlag = Boolean.FALSE;
        }
    }
}
