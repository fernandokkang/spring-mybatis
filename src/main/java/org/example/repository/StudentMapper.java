package org.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.dto.Student;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {

    void registerStudent(Map<String, Object> params);
    void updateStudent(Map<String, Object> params);
    List<Student> getStudent();
    List<Student> findByName(String name);
    int countStudent(long id);
}
