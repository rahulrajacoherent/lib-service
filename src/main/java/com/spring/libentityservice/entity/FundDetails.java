package com.spring.libentityservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnTransformer;

@Table(name = "fund_details")
@Entity
@Getter
@Setter
public class FundDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(subscriber),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "subscriber")
    private String subscriber;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(corpus),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "corpus")
    private String corpus;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(available_corpus),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "available_corpus")
    private String availableCorpus;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(sanctioned_debt),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "sanctioned_debt")
    private String sanctionedDebt;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(disbursed_debt),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "disbursed_debt")
    private String disbursedDebt;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(yet_to_disburse),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "yet_to_disburse")
    private String yetToDisburse;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(collected_debt),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "collected_debt")
    private String collectedDebt;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(outstanding_debt),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "outstanding_debt")
    private String outstandingDebt;

    @Transient
    private String availableCorpusWithoutFormatting;


    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(sanctioned_equity),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "sanctioned_equity")
    private String sanctionedEquity;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(capital_realized),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "capital_realized")
    private String capitalRealized;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(scheme_percentage),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "scheme_percentage")
    private String schemePercentage;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "scheme_flag")
    private boolean schemeFlag;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(disbursed_equity),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "disbursed_equity")
    private String disbursedEquity;

    @ColumnTransformer(
            read = "CONVERT(AES_DECRYPT(UNHEX(balance_capital),'1234') USING utf8)",
            write = "HEX(AES_ENCRYPT(?, '1234'))")
    @Column(name = "balance_capital")
    private String balanceCapital;
    @Column(name = "deleted_flag")
    private Boolean deletedFlag;

    @Column(name = "code")
    private String code;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;



}
