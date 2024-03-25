package com.gdu.prj08.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileDto {
  private int fileNo;
  private String path;
  private String originalName;
  private String filesystemName;
}
