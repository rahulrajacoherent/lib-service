//package com.spring.libentityservice.entity;
//import com.spring.libentityservice.entity.SamEntity;
//import com.spring.libentityservice.entity.ThorEntity;
//import com.spring.libentityservice.entity.Pre_paymentEntity;
//
//import jakarta.persistence.*;
//import lombok.*;
//import lombok.*;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.util.Objects;
//
//@Entity
//@Table(name = "sds")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.ALWAYS)
//@ToString
//public class Sds implements Serializable {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	@JsonProperty("id")
//	private Long id;
//
//	@Column(name = "name")
//	@JsonProperty("name")
//	private String name;
//
//
//    @Column(name = "a")
//    @JsonProperty(a)
//    private Long a;
//
//
//    @Column(name = "a")
//    @JsonProperty(a)
//    private LocalDateTime a;
//
//
//    @Column(name = "bn")
//    @JsonProperty(bn)
//    private LocalDateTime bn;
//
//
//    @Column(name = "bn")
//    @JsonProperty(bn)
//    private String bn;
//
//
//    @Column(name = "bn")
//    @JsonProperty(bn)
//    private LocalDateTime bn;
//
//
//    @Column(name = "his")
//    @JsonProperty(his)
//    private String his;
//
//
//    @Column(name = "sum")
//    @JsonProperty(sum)
//    private String sum;
//
//
//    @Column(name = "test")
//    @JsonProperty(test)
//    private String test;
//
//
//    @Column(name = "trd")
//    @JsonProperty(trd)
//    private String trd;
//
//
//
//
//
//
//    @JsonProperty(id)
//    private Pre_paymentEntity id;
//
//
//
//
//    @JsonProperty("sdsd")
//    private Pre_paymentEntity sdsd;
//
//
//    @JsonProperty("bcsvc")
//    private Pre_paymentEntity bcsvc;
//
//
//    @JsonProperty("bcsvc")
//    private ThorEntity bcsvc;
//
//
//    @JsonProperty("bcsvc")
//    private SamEntity bcsvc;
//
//
//    @ManyToOne
//    @JoinColumn(name = "bcsvc", referencedColumnName = "id")
//    @JsonProperty("bcsvc")
//    private SamEntity bcsvc;
//
//}