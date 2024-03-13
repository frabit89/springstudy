package com.gdu.prj01.anno03;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MyController {
  
  private MyService myService;
  
  public void add() {
    myService.add();
    System.out.println("Controller() add() 호출");
  }
  
}
