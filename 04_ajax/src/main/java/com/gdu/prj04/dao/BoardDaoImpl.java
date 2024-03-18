package com.gdu.prj04.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdu.prj04.dto.BoardDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class BoardDaoImpl implements BoardDao {

  private BoardDto board1;
  private BoardDto board2;
  private BoardDto board3;
  
//// board에 주입해주는 constructor == @AllArgsConstructor 
//@Autowired // 생략 가능
//public BoardDaoImpl(BoardDto board1, BoardDto board2, BoardDto board3) {
//    super();
//    this.board1 = board1;
//    this.board2 = board2;
//    this.board3 = board3;
//  }

// 이와 같은 방식으로 사용하면 값이 있는 경우 알아서 연결 가능하다.
//  @Autowired    
//  public void setBean(BoardDto board1, BoardDto board2, BoardDto board3) {
//    this.board1 = board1;
//    this.board2 = board2;
//    this.board3 = board3;
//  }
// 결론은 상단에 @AllArgsConstructor  
  
  @Override
  public List<BoardDto> getBoardList() {
    return Arrays.asList(board1, board2, board3);
  }

  @Override
  public BoardDto getBoardByNo(int boardNo) {
    BoardDto board = null;
    switch(boardNo) {
    case 1 : board = board1; break;
    case 2 : board = board2; break;
    case 3 : board = board3; break;
    }
    return board;
  }

}
