package com.gdu.prj03.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gdu.prj03.dao.BoardDao;
import com.gdu.prj03.dao.BoardDaoImpl;

@Controller
public class WelcomeController {
  
  @GetMapping(value= {"/", "/main.do"})
  public String welcome() {

    return "index";
  }
  
}
