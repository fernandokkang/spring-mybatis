package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.LectureApplicantsMapper;
import org.example.repository.LectureMapper;
import org.example.repository.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class LectureApplicantsService {

    private final LectureApplicantsMapper lectureApplicantsMapper;
    private final StudentMapper studentMapper;
    private final LectureMapper lectureMapper;

    public void registerApplicant(Map<String, Object> param) {

        long studentId = Long.parseLong((String) param.get("studentId"));
        long lectureCourseId = Long.parseLong((String) param.get("lectureCourseId"));

        validate(studentId, lectureCourseId);

        lectureApplicantsMapper.registerLectureApplicants(param);
    }

    private void validate(long studentId, long lectureCourseId) {

        if(isNotExistLecture(lectureCourseId)) {
            throw new IllegalStateException("존재하지 않는 강의입니다.");
        }

        if(isNotExistStudent(studentId)) {
            throw new IllegalStateException("존재하지 않는 학생입니다.");
        }

        if(isFull(lectureCourseId)) {
            throw new IllegalStateException("수강 인원이 다 찼습니다.");
        }

        if(isLectureAlreadyRegistered(studentId, lectureCourseId)) {
            throw new IllegalStateException("이미 수강 신청한 강의입니다.");
        }
    }

    private boolean isNotExistStudent(long studentId) {

        return studentMapper.countStudent(studentId) == 0;
    }

    private boolean isNotExistLecture(long lectureCourseId) {

        return lectureMapper.countLecture(lectureCourseId) == 0;
    }

    private boolean isFull(long lectureCourseId) {

        int capacity = lectureMapper.getCapacity(lectureCourseId);
        int currentApplicants = lectureApplicantsMapper.countApplicants(lectureCourseId);

        return capacity == currentApplicants;
    }

    private boolean isLectureAlreadyRegistered(long studentId, long lectureCourseId) {

        return lectureApplicantsMapper.isLectureAlreadyRegistered(studentId, lectureCourseId) == 1;
    }
}
