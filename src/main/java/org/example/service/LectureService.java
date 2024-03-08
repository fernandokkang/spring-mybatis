package org.example.service;

import org.example.model.dto.LectureCourseDetail;
import org.example.model.dto.LectureCourseInfo;
import org.example.repository.InstructorMapper;
import org.example.repository.LectureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class LectureService {

    private final LectureMapper lectureMapper;
    private final InstructorMapper instructorMapper;
    public List<LectureCourseInfo> getLectureCourseInfo() {

        return lectureMapper.selectLectureCourseInfos();
    }

    public List<LectureCourseDetail> getLectureCourseDetails(Map<String, Object> params) {

        return lectureMapper.selectLectureCourseDetails(params);
    }

    public void registerLecture(Map<String, Object> params) {

        long instructorId = Long.parseLong((String) params.get("instructorId"));
        String type = "등록";

        validate(instructorId, type);

        lectureMapper.registerLecture(params);
    }

    public void updateLecture(Map<String, Object> params) {

        long instructorId = Long.parseLong((String) params.get("instructorId"));
        String type = "변경";

        validate(instructorId, type);

        lectureMapper.updateLecture(params);
    }

    private void validate(long instructorId, String type) {

        if(isNotExistInstructor(instructorId)) {
            throw new IllegalStateException("해당 강사 정보가 존재하지 않아 강의 정보를 "+type+"할 수 없습니다.");
        }

        if(isLectureLimitOver(instructorId)) {
            throw new IllegalStateException("해당 강사는 이미 2개 이상의 강의를 담당하고 있어 "+type+"할 수 없습니다.");
        }
    }

    private boolean isLectureLimitOver(long instructorId) {

        return lectureMapper.countLecturesByInstructorId(instructorId) >= 2;
    }

    private boolean isNotExistInstructor(long instructorId) {

        return instructorMapper.countInstructor(instructorId) == 0;
    }
}
