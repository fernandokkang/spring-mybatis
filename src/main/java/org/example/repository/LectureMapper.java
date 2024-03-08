package org.example.repository;

import org.example.model.dto.LectureCourseDetail;
import org.example.model.dto.LectureCourseInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LectureMapper {

    List<LectureCourseInfo> selectLectureCourseInfos();
    List<LectureCourseDetail> selectLectureCourseDetails(Map<String, Object> params);
    void registerLecture(Map<String, Object> params);
    void updateLecture(Map<String, Object> params);
    int countLecturesByInstructorId(long instructorId);
    int getCapacity(long id);
    int countLecture(long id);
}
