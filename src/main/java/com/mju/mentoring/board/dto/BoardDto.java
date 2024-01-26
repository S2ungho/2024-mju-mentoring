package com.mju.mentoring.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;
}
