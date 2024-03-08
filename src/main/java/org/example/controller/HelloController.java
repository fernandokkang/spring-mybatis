package com.example.jpapractice.controller;

import com.example.jpapractice.repository.StudentJdbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final StudentJdbcRepository studentJdbcRepository;

    @GetMapping("/hello")
    public int hi() {

        return studentJdbcRepository.countOfStudent();
    }
}
