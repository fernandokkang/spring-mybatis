package com.example.jpapractice.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudentJdbcRepository {
    private final JdbcTemplate jdbcTemplate;

    public int countOfStudent() {

        return jdbcTemplate.queryForObject("select count(1) from student", Integer.class);
    }
}
