package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.AttendanceService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    @PutMapping("/check")
    public void checkAttendance(@RequestParam Map<String, Object> params) {

        attendanceService.checkAttendance(params);
    }
}
