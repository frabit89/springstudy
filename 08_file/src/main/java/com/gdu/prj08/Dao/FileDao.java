package com.gdu.prj08.dao;

import com.gdu.prj08.Dto.FileDto;
import com.gdu.prj08.Dto.HistoryDto;

public interface FileDao {
  int insertHistory(HistoryDto history);
  int insertFile(FileDto file);
}