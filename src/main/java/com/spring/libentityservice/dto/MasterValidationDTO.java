package com.spring.libentityservice.dto;

public class MasterValidationDTO {

    private Integer id;

    private Integer stageId;

    private String stageName;

    private Integer stageTabId;

    private String tabName;

    private Integer subMasterId;

    private Integer statusId;

    private String statusName;

    private String validationJson;

    private String flowType;

    private Integer nextStage;

    private String stageValidationJson;

    private Integer previousStageId;

    private String previousStageName;

    private Integer previousStageTabId;

    private String previousTabName;

    private String type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Integer getStageTabId() {
        return stageTabId;
    }

    public void setStageTabId(Integer stageTabId) {
        this.stageTabId = stageTabId;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public Integer getSubMasterId() {
        return subMasterId;
    }

    public void setSubMasterId(Integer subMasterId) {
        this.subMasterId = subMasterId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getValidationJson() {
        return validationJson;
    }

    public void setValidationJson(String validationJson) {
        this.validationJson = validationJson;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public Integer getNextStage() {
        return nextStage;
    }

    public void setNextStage(Integer nextStage) {
        this.nextStage = nextStage;
    }

    public String getStageValidationJson() {
        return stageValidationJson;
    }

    public void setStageValidationJson(String stageValidationJson) {
        this.stageValidationJson = stageValidationJson;
    }

    public Integer getPreviousStageId() {
        return previousStageId;
    }

    public void setPreviousStageId(Integer previousStageId) {
        this.previousStageId = previousStageId;
    }

    public String getPreviousStageName() {
        return previousStageName;
    }

    public void setPreviousStageName(String previousStageName) {
        this.previousStageName = previousStageName;
    }

    public Integer getPreviousStageTabId() {
        return previousStageTabId;
    }

    public void setPreviousStageTabId(Integer previousStageTabId) {
        this.previousStageTabId = previousStageTabId;
    }

    public String getPreviousTabName() {
        return previousTabName;
    }

    public void setPreviousTabName(String previousTabName) {
        this.previousTabName = previousTabName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MasterValidationDTO(Integer id, Integer stageId, String stageName, Integer stageTabId, String tabName, Integer subMasterId, Integer statusId, String statusName, String validationJson, String flowType, Integer nextStage, String stageValidationJson, Integer previousStageId, String previousStageName, Integer previousStageTabId, String previousTabName,String type) {
        this.id = id;
        this.stageId = stageId;
        this.stageName = stageName;
        this.stageTabId = stageTabId;
        this.tabName = tabName;
        this.subMasterId = subMasterId;
        this.statusId = statusId;
        this.statusName = statusName;
        this.validationJson = validationJson;
        this.flowType = flowType;
        this.nextStage = nextStage;
        this.stageValidationJson = stageValidationJson;
        this.previousStageId = previousStageId;
        this.previousStageName = previousStageName;
        this.previousStageTabId = previousStageTabId;
        this.previousTabName = previousTabName;
        this.type = type;
    }

    public MasterValidationDTO() {
    }
}
