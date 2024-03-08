package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.dto.Student;
import org.example.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @PutMapping("/register")
    public void registerStudent(@RequestParam Map<String, Object> params) {

        studentService.registerStudent(params);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestParam Map<String, Object> params) {

        studentService.updateStudent(params);
    }

    @GetMapping("/list")
    public List<Student> getStudent() {

        return studentService.getStudent();
    }

    @GetMapping("/search")
    public List<Student> searchStudent(String name) {

        return studentService.searchStudent(name);
    }
}
