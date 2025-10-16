package com.spring.libentityservice.entity;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "mill_wright")
@Getter
@Setter
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.ALWAYS)
@ToString
public class MillWright implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	private Long id;

	@Column(name = "is_active")
	@JsonProperty("isActive")
	private Boolean isActive;

	@Column(name = "deleted_flag")
	@JsonProperty("deletedFlag")
	private Boolean deletedFlag;

	@Column(name = "created_by")
	@JsonProperty("createdBy")
	private Long createdBy;

    @CreationTimestamp
	@Column(name = "created_at")
	@JsonProperty("createdAt")
	private LocalDateTime createdAt;

    @UpdateTimestamp
	@Column(name = "modified_at")
	@JsonProperty("modifiedAt")
	private LocalDateTime modifiedAt;

	@Column(name = "modified_by")
	@JsonProperty("modifiedBy")
	private Long modifiedBy;

	@Column(name = "will_wright_user")
	@JsonProperty("willWrightUser")
	private String willWrightUser;

	@Column(name = "flow_type")
	@JsonProperty("flowType")
	private String flowType;

	@Column(name = "deal_id")
	@JsonProperty("dealId")
	private String dealId;

@PrePersist
public void prePersist() {
    this.isActive = Boolean.TRUE;
    this.deletedFlag = Boolean.FALSE;
}
}
