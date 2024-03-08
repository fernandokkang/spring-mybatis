package com.example.jpapractice.service;

import com.example.jpapractice.model.dto.LectureCourseDetail;
import com.example.jpapractice.model.dto.LectureCourseInfo;
import com.example.jpapractice.repository.LectureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class LectureService {

    private final LectureMapper lectureMapper;

    public List<LectureCourseInfo> getLectureCourseInfo() {
        return lectureMapper.selectLectureCourseInfos();
    }

    public List<LectureCourseDetail> getLectureCourseDetails(Map<String, Object> params) {
        return lectureMapper.selectLectureCourseDetails(params);
    }
}
