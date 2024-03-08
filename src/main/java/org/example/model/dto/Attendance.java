package org.example.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Attendance {

    private long id;
    private long lectureCourseId;
    private long studentId;
    private LocalDateTime createdAt;
}
