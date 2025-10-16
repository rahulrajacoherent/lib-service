package com.spring.libentityservice.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_role_mapping")
public class UserRoleMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private DmsUser user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private DmsRoles masterRole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DmsUser getUser() {
        return user;
    }

    public void setUser(DmsUser user) {
        this.user = user;
    }

    public DmsRoles getMasterRole() {
        return masterRole;
    }

    public void setMasterRole(DmsRoles masterRole) {
        this.masterRole = masterRole;
    }
}
