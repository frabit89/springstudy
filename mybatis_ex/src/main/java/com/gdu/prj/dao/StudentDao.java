package com.gdu.prj.dao;

import java.util.List;
import java.util.Map;

import com.gdu.prj.dto.StudentDto;

public interface StudentDao {
  int insertStudent(StudentDto student);
  int modifyStudent(StudentDto student);
  int deleteStudent(int student_no);
  List<StudentDto> selectStudentList(Map<String, Object> params);
  int getStudentCount();
  StudentDto selectBoardByNo(int board_no);
}
