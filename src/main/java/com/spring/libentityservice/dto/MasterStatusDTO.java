package com.spring.libentityservice.dto;

public class MasterStatusDTO {

    private Integer id;

    private String statusName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public MasterStatusDTO(Integer id, String statusName) {
        this.id = id;
        this.statusName = statusName;
    }
}


