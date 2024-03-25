package com.gdu.prj08;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {

  @Inject
  private DataSource ds;
  
  @Test
  public void 테스트연결() throws Exception {
    try (Connection con = ds.getConnection()) {
      System.out.println(con);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
