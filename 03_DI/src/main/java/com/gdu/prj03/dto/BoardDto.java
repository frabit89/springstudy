package com.gdu.prj03.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor            // 생성자
@AllArgsConstructor           
@Data
@Builder
public class BoardDto {
  private int boardNo;
  private String title;
  private String contents;
  
}