package com.gdu.prj04.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdu.prj04.dto.BoardDto;
import com.gdu.prj04.service.BoardService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/ajax2")
@RequiredArgsConstructor
@RestController
public class BoardController2 {
  
  private final BoardService boardService;
  
  @GetMapping(value="/list.do", produces=MediaType.APPLICATION_JSON_VALUE)
  public List<BoardDto> list() {
    return boardService.getBoardList();
  }
  
  @GetMapping(value="/detail.do", produces=MediaType.APPLICATION_JSON_VALUE)
  //BoardDto 의 board파라미터를 전달해도 BoardNo를 꺼내 쓸 수 있다.
  public BoardDto detail(BoardDto board) {
    return boardService.getBoardByNo(board.getBoardNo());
  }
  
}
