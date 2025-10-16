package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "promotor_details")
public class PromotorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "promotor_name")
    private String promotorName;

    @Column(name = "promotor_pan")
    private String promotorPan;

    @Column(name = "promotor_aadhar")
    private String promotorAadhar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deal_id_fk")
    @JsonBackReference
    private Deal deal;

    @Column(name = "promotor_flag")
    private String promotorFlag;

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
}
