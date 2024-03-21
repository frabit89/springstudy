package com.gdu.prj07.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.gdu.prj07.aspect.MyAfterAspect;
import com.gdu.prj07.aspect.MyAroundAspect;
import com.gdu.prj07.aspect.MyBeforeAspect;

@EnableAspectJAutoProxy   // Aspect 허용 
@Configuration            // bean을 만들겠다는 선언
public class AppConfig {

  @Bean
  public MyAroundAspect myAroundAspect() {
    return new MyAroundAspect();
  }
  
  @Bean
  public MyBeforeAspect myBeforeAspect() {
    return new MyBeforeAspect();
  }
  
  @Bean
  public MyAfterAspect myAfterAspect() {
    return new MyAfterAspect();
  }
  
  
}
