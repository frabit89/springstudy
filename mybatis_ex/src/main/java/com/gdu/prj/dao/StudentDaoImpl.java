package com.gdu.prj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.gdu.prj.dto.StudentDto;

public class StudentDaoImpl implements StudentDao {

  private Connection con;
  private PreparedStatement ps;
  private ResultSet rs;
  
  private DataSource dataSource;
  
  private static StudentDao studentDao = new StudentDaoImpl();
  
  private void StudentDaoImpl() {
    try {
      
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
  
  public static StudentDao getInstance() {
    return studentDao;
  }
  
  @Override
  public int insertStudent(StudentDto student) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int modifyStudent(StudentDto student) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int deleteStudent(int student_no) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public List<StudentDto> selectStudentList(Map<String, Object> params) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getStudentCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public StudentDto selectBoardByNo(int board_no) {
    // TODO Auto-generated method stub
    return null;
  }

}
