package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "deal_management")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.ALWAYS)
@ToString
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DealManagement implements Serializable {

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

	@Column(name = "manager_name")
	@JsonProperty("managerName")
	private String managerName;

	@PrePersist
	public void prePersist() {
		this.isActive = Boolean.TRUE;
		this.deletedFlag = Boolean.FALSE;
	}



    @Column(name = "flow_type")
    @JsonProperty("flowtype")
    private String flowType;


    @ManyToOne
    @JoinColumn(name = "deal_id")
    @JsonProperty("deal_id")
    private Deal deal;

}