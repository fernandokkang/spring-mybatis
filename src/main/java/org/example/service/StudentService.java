package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.dto.Student;
import org.example.repository.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentMapper studentMapper;

    public void registerStudent(Map<String, Object> params) {

        studentMapper.registerStudent(params);
    }

    public void updateStudent(Map<String, Object> params) {

        studentMapper.updateStudent(params);
    }

    public List<Student> getStudent() {

        return studentMapper.getStudent();
    }

    public List<Student> searchStudent(String name) {

        return studentMapper.findByName(name);
    }
}
