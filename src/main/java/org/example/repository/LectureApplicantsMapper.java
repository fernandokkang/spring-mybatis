package org.example.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LectureApplicantsMapper {

    void registerLectureApplicants(Map<String, Object> param);
    int countApplicants(long lectureCourseId);
    int isLectureAlreadyRegistered(long studentId, long lectureCourseId);
}
