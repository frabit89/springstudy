package com.gdu.prj04.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
  private int boardNo;
  private String title;
  private String contents;
}
