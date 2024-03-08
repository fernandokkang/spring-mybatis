package org.example.controller;

import org.example.model.dto.LectureCourseDetail;
import org.example.model.dto.LectureCourseInfo;
import org.example.service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lecture")
public class LectureController {

    private final LectureService lectureService;

    @GetMapping("")
    public List<LectureCourseInfo> getLecture() {

        return lectureService.getLectureCourseInfo();
    }

    @GetMapping("/details")
    public List<LectureCourseDetail> getLectureCourseDetails(@RequestParam Map<String, Object> params) {

        return lectureService.getLectureCourseDetails(params);
    }

    @PutMapping("/register")
    public void registerLecture(@RequestParam Map<String, Object> params) {

        lectureService.registerLecture(params);
    }

    @PutMapping("/update")
    public void updateLecture(@RequestParam Map<String, Object> params) {

        lectureService.updateLecture(params);
    }
}
