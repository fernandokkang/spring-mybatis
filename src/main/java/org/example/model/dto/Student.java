package org.example.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private long id;
    private String name;
    private long age;
    private String desc;
    private LocalDateTime createdAt;
}
