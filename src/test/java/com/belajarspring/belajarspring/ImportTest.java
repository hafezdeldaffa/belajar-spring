package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Bar;
import com.belajarspring.belajarspring.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void importTest() {
    Foo foo = applicationContext.getBean(Foo.class);
    Bar bar = applicationContext.getBean(Bar.class);
  }
}
