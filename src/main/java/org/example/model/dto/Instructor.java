package org.example.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Instructor {

    private long id;
    private String name;
    private int left;
    private String desc;
    private LocalDateTime createdAt;
}
