package com.gdu.prj.service;

import com.gdu.prj.common.ActionForward;

import jakarta.servlet.http.HttpServletRequest;

public interface StudentService {
  ActionForward addStudent(HttpServletRequest request);
  ActionForward getStudentList(HttpServletRequest request);
  ActionForward getStudentNo(HttpServletRequest request);
  ActionForward modifyStudent(HttpServletRequest request);
  ActionForward removeStudent(HttpServletRequest request);
}
