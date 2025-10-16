package com.spring.libentityservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "dms_meetings")
@Data
public class DMSMeetings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "deal_id_fk")
    private Deal deal;

    @ManyToOne
    @JoinColumn(name = "attendees_type_id")
    private MnemonicMasterNew dealAttendees;

    @Column(name = "i_calu_id")
    private String iCalUId;

    @Column(name = "u_id")
    private String uid;

    @Column(name = "subject")
    private String subject;

    @Column(name = "body_preview")
    private String bodyPreview;

    @Column(name = "web_Link")
    private String webLink;

    @Column(name = "content")
    private String content;

    @Column(name = "start_date_time")
    private String start;

    @Column(name = "end_date_time")
    private String end;

    @Column(name = "attendees")
    private String attendees;

    @Column(name = "organizer")
    private String organizer;

    @Column(name = "join_Url")
    private String joinUrl;

    @Column(name = "change_Key")
    private String changeKey;

    @Column(name = "original_start_time_zone")
    private String originalStartTimeZone;

    @Column(name = "original_end_time_zone")
    private String originalEndTimeZone;

    @Column(name = "event_id")
    private String eventId;

    @Column(name = "meeting_id")
    private String meetingId;

    @Column(name = "meeting_duration")
    private String meetingDuration;

    @Column(name = "meeting_notes")
    private String meetingNotes;

    @Column(name = "ic_note_flag")
    private Boolean icNoteFlag;

    @Column(name = "meet_flag")
    private String meetFlag;

    @Column(name = "recording_flag")
    private String recordingFlag;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "meeting_Flag")
    private String meetingFlag;

    @Column(name = "created_by")
    private Long createdBy;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "seed_attendees_type")
    private String seedAttendeesType;

    @Column(name ="flow_Type")
    private String flowType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public MnemonicMasterNew getDealAttendees() {
        return dealAttendees;
    }

    public void setDealAttendees(MnemonicMasterNew dealAttendees) {
        this.dealAttendees = dealAttendees;
    }

    public String getiCalUId() {
        return iCalUId;
    }

    public void setiCalUId(String iCalUId) {
        this.iCalUId = iCalUId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBodyPreview() {
        return bodyPreview;
    }

    public void setBodyPreview(String bodyPreview) {
        this.bodyPreview = bodyPreview;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getAttendees() {
        return attendees;
    }

    public void setAttendees(String attendees) {
        this.attendees = attendees;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getJoinUrl() {
        return joinUrl;
    }

    public void setJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
    }

    public String getChangeKey() {
        return changeKey;
    }

    public void setChangeKey(String changeKey) {
        this.changeKey = changeKey;
    }

    public String getOriginalStartTimeZone() {
        return originalStartTimeZone;
    }

    public void setOriginalStartTimeZone(String originalStartTimeZone) {
        this.originalStartTimeZone = originalStartTimeZone;
    }

    public String getOriginalEndTimeZone() {
        return originalEndTimeZone;
    }

    public void setOriginalEndTimeZone(String originalEndTimeZone) {
        this.originalEndTimeZone = originalEndTimeZone;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingDuration() {
        return meetingDuration;
    }

    public void setMeetingDuration(String meetingDuration) {
        this.meetingDuration = meetingDuration;
    }

    public String getMeetingNotes() {
        return meetingNotes;
    }

    public void setMeetingNotes(String meetingNotes) {
        this.meetingNotes = meetingNotes;
    }

    public Boolean getIcNoteFlag() {
        return icNoteFlag;
    }

    public void setIcNoteFlag(Boolean icNoteFlag) {
        this.icNoteFlag = icNoteFlag;
    }

    public String getMeetFlag() {
        return meetFlag;
    }

    public void setMeetFlag(String meetFlag) {
        this.meetFlag = meetFlag;
    }

    public String getRecordingFlag() {
        return recordingFlag;
    }

    public void setRecordingFlag(String recordingFlag) {
        this.recordingFlag = recordingFlag;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getMeetingFlag() {
        return meetingFlag;
    }

    public void setMeetingFlag(String meetingFlag) {
        this.meetingFlag = meetingFlag;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
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

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getSeedAttendeesType() {
        return seedAttendeesType;
    }

    public void setSeedAttendeesType(String seedAttendeesType) {
        this.seedAttendeesType = seedAttendeesType;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }
}
