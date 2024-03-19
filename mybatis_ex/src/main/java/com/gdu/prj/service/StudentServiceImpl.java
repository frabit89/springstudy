package com.gdu.prj.service;

import com.gdu.prj.common.ActionForward;
import com.gdu.prj.dao.StudentDao;
import com.gdu.prj.dao.StudentDaoImpl;

import jakarta.servlet.http.HttpServletRequest;

public class StudentServiceImpl implements StudentService {
  
  private StudentDao studentDao = StudentDaoImpl.getInstance();
  
  @Override
  public ActionForward addStudent(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ActionForward getStudentList(HttpServletRequest request) {
    
    return null;
  }

  @Override
  public ActionForward getStudentNo(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ActionForward modifyStudent(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ActionForward removeStudent(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

}
