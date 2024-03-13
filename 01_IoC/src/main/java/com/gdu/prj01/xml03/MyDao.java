package com.gdu.prj01.xml03;

import java.sql.Connection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.Data;
import lombok.NoArgsConstructor;

 @NoArgsConstructor
 @Data
public class MyDao {
  
  private Connection con;
  private MyConnection myConnection;
  
  private Connection getConnection() {
    Connection con = null;
    AbstractApplicationContext ctx = new GenericXmlApplicationContext("com/gdu/prj01/xml03/app-context.xml");
    myConnection = ctx.getBean("myConnection", MyConnection.class); 
    con = myConnection.getConnection();
    ctx.close();
    return con;
  }
  
  private void close() {
    try {
      if(con != null) {
        con.close();
        System.out.println(myConnection.getUser() + "접속해제되었습니다.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public void add() {
    con = myConnection.getConnection();
    System.out.println("MyDao add() 호출");
    close();
  }
  
  
}
