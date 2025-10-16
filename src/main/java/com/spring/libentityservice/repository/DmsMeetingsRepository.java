package com.spring.libentityservice.repository;

import com.spring.libentityservice.entity.DMSMeetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DmsMeetingsRepository extends JpaRepository<DMSMeetings, Integer> {

    List<DMSMeetings> findAllByDealIdAndIcNoteFlagAndMeetFlagAndFlowType(int dealId, boolean b, String meet, String flowType);

    List<DMSMeetings> findAllByDealIdAndIcNoteFlagAndFlowType(Integer id, Boolean aFalse,String flowType);

    @Query("SELECT DISTINCT d.attendees FROM DMSMeetings d")
    List<String> findAllAttendees();
    @Query(value = "SELECT * FROM dms_meetings WHERE DATE(start_date_time) = DATE(:startDateTime)\n" +
            "  AND (\n" +
            "    (start_date_time BETWEEN :startDateTime AND :endDateTime)\n" +
            "    OR (end_date_time BETWEEN :startDateTime AND :endDateTime)\n" +
            "    OR (:startDateTime BETWEEN start_date_time AND end_date_time)\n" +
            "    OR (:endDateTime BETWEEN start_date_time AND end_date_time)\n" +
            "  ) and deal_id_fk = :dealID and ic_note_flag =:icFlag and flow_Type =:flowType",nativeQuery = true)
    List<DMSMeetings> findTimeSlotByDeal(Integer dealID, String startDateTime, String endDateTime,boolean icFlag,String flowType);

    @Query(value = "SELECT * FROM dms_meetings WHERE DATE(start_date_time) = DATE(:startDateTime)\n" +
            "  AND (\n" +
            "    (start_date_time BETWEEN :startDateTime AND :endDateTime)\n" +
            "    OR (end_date_time BETWEEN :startDateTime AND :endDateTime)\n" +
            "    OR (:startDateTime BETWEEN start_date_time AND end_date_time)\n" +
            "    OR (:endDateTime BETWEEN start_date_time AND end_date_time)\n" +
            "  ) and deal_id_fk = :dealID AND id NOT IN (:meetingId) AND flow_type =:flowType",nativeQuery = true)
    List<DMSMeetings> findByIdTimeSlotByDeal(
            Integer dealID,Integer meetingId, String startDateTime, String endDateTime,String flowType
    );
}
