package com.gdu.prj03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdu.prj03.dao.BoardDao;
import com.gdu.prj03.dto.BoardDto;

import lombok.RequiredArgsConstructor;

//       @Controller  @Service  @Repositosry
//view - controller - service - dao

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {
  
  //1. 필드 주입
  //@Autowired 
  //private BoardDao boardDao;
  private final BoardDao boardDao;

  @Override
  public List<BoardDto> getBoardList() {
    return boardDao.getBoardList();
  }

  @Override
  public BoardDto getBoardByNo(int boardNo) {
    return boardDao.getBoardByNo(boardNo);
  }

}
