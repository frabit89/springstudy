package com.gdu.prj.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gdu.prj.common.ActionForward;
import com.gdu.prj.service.StudentService;
import com.gdu.prj.service.StudentServiceImpl;

public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private StudentService studentService = new StudentServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    /* 요청 UTF-8 인코딩 */
    request.setCharacterEncoding("UTF-8");
    
    /* 어떤 요청인지 확인 (URLMapping 확인) */
    String requestURI = request.getRequestURI(); /* http://localhost:8080/mvc/getDate.do */
    String contextPath = request.getContextPath();/* /mvc */
    String urlMapping = requestURI.substring(requestURI.indexOf(contextPath) + contextPath.length());
    
    ActionForward actionForward = null;
    
    // 인터페이스 안에는 추상 메소드가 있음 
	  
    
    /* 요청에 따른 메소드 호출 */
    switch(urlMapping) {
    case "/student/list.do": 
      actionForward = studentService.getStudentList(request);
      break;
   // case "/getTime.do":
      //actionForward = myInterface.getTime(request);

     // break;
    //case "/getDateTime.do":
      //actionForward = myInterface.getDateTime(request);
 
 //     break;
    }
    /* 어디로 어떻게 이동할 것인지 결정 */
    if(actionForward != null) {
      if(actionForward.isRedirect()) {
        response.sendRedirect(actionForward.getView());
      } else {
        request.getRequestDispatcher(actionForward.getView()).forward(request, response);
      }
    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
