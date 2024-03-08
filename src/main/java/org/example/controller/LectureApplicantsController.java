package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.LectureApplicantsService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lectureApplicants")
public class LectureApplicantsController {

    private final LectureApplicantsService lectureApplicantsService;

    @PutMapping("/register")
    public void register(@RequestParam Map<String, Object> params) {

        lectureApplicantsService.registerApplicant(params);
    }
}
