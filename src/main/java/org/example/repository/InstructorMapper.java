package org.example.repository;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.dto.Instructor;

import java.util.List;
import java.util.Map;

@Mapper
public interface InstructorMapper {

    void registerInstructor(Map<String, Object> params);
    List<Instructor> getInstructors();
    int countInstructor(long instructorId);
}
