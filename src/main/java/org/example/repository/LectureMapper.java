package com.example.jpapractice.repository;

import com.example.jpapractice.model.dto.LectureCourseDetail;
import com.example.jpapractice.model.dto.LectureCourseInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LectureMapper {

    List<LectureCourseInfo> selectLectureCourseInfos();

    List<LectureCourseDetail> selectLectureCourseDetails(Map<String, Object> params);
}
