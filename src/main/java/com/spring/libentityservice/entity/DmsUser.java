package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "dms_user")
public class DmsUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @ColumnTransformer(
          read = "CONVERT(AES_DECRYPT(UNHEX(first_name),'1234') USING utf8)",
          write = "HEX(AES_ENCRYPT(?, '1234'))")
  @Column(name = "first_name")
  private String firstName;

  @ColumnTransformer(
          read = "CONVERT(AES_DECRYPT(UNHEX(last_name),'1234') USING utf8)",
          write = "HEX(AES_ENCRYPT(?, '1234'))")
  @Column(name = "last_name")
  private String lastName;

  @ManyToOne
  @JoinColumn(name = "role_id_fk")
  private DmsRoles dmsRoles;

  @ColumnTransformer(
          read = "CONVERT(AES_DECRYPT(UNHEX(email),'1234') USING utf8)",
          write = "HEX(AES_ENCRYPT(?, '1234'))")
  @Column(name = "email")
  private String email;

  @ColumnTransformer(
          read = "CONVERT(AES_DECRYPT(UNHEX(phone_no),'1234') USING utf8)",
          write = "HEX(AES_ENCRYPT(?, '1234'))")
  @Column(name = "phone_no")
  private String phoneNo;

  @ColumnTransformer(
          read = "CONVERT(AES_DECRYPT(UNHEX(username),'1234') USING utf8)",
          write = "HEX(AES_ENCRYPT(?, '1234'))")
  @Column(name = "username")
  private String userName;

  @Column(name = "password")
  private String password;

  @Column(name = "is_active")
  private Boolean isActive;

  @Column(name = "deleted_flag")
  private Boolean deletedFlag;

  @CreationTimestamp
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  @Column(name = "created_at")
  private Timestamp createdAt;

  @UpdateTimestamp
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
  @Column(name = "modified_at")
  private Timestamp modifiedAt;

  @Column(name = "created_by")
  private Long createdBy;

  @Column(name = "modified_by")
  private Long modifiedBy;

  @Column(name = "email_notification")
  private boolean emailNotification;

  @Column(name = "push_notification")
  private boolean pushNotification;

  @Column(name = "flow_type")
  private String flowType;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public DmsRoles getDmsRoles() {
    return dmsRoles;
  }

  public void setDmsRoles(DmsRoles dmsRoles) {
    this.dmsRoles = dmsRoles;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public boolean isEmailNotification() {
    return emailNotification;
  }

  public void setEmailNotification(boolean emailNotification) {
    this.emailNotification = emailNotification;
  }

  public boolean isPushNotification() {
    return pushNotification;
  }

  public void setPushNotification(boolean pushNotification) {
    this.pushNotification = pushNotification;
  }

  public String getFlowType() {
    return flowType;
  }

  public void setFlowType(String flowType) {
    this.flowType = flowType;
  }
}
