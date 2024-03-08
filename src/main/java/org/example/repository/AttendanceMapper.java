package org.example.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface AttendanceMapper {

    void checkAttendance(Map<String, Object> param);
    int existAttendanceInfo(long studentId, long lectureCourseId);
}
