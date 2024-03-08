package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.AttendanceMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceMapper attendanceMapper;

    public void checkAttendance(Map<String, Object> param) {

        long studentId = Long.parseLong((String) param.get("studentId"));
        long lectureCourseId = Long.parseLong((String) param.get("lectureCourseId"));

        validate(studentId, lectureCourseId);

        attendanceMapper.checkAttendance(param);
    }

    private void validate(long studentId, long lectureCourseId) {

        if(existAttendanceInfo(studentId, lectureCourseId)){
            throw new IllegalStateException("이미 출석체크 하셨습니다.");
        }
    }

    private boolean existAttendanceInfo(long studentId, long lectureCourseId) {

        return attendanceMapper.existAttendanceInfo(studentId, lectureCourseId) == 1;
    }
}
