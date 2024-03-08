package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.dto.Instructor;
import org.example.repository.InstructorMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class InstructorService {

    private final InstructorMapper instructorMapper;

    public void registerInstructor(Map<String, Object> params) {

        instructorMapper.registerInstructor(params);
    }

    public List<Instructor> getInstructors() {

        return instructorMapper.getInstructors();
    }
}
