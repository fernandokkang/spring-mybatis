package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.dto.Instructor;
import org.example.service.InstructorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PutMapping("/register")
    public void registerInstructor(@RequestParam Map<String, Object> params) {

        instructorService.registerInstructor(params);
    }

    @GetMapping("/list")
    public List<Instructor> getInstructors() {

        return instructorService.getInstructors();
    }
}
