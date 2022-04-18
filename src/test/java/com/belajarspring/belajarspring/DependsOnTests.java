package com.belajarspring.belajarspring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTests {
  @Test
  void testDependsOn() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);

    applicationContext.getBean("foo");
    applicationContext.getBean("bar");
  }
}
