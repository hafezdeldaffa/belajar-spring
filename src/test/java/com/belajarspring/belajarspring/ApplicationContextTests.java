package com.belajarspring.belajarspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class ApplicationContextTests {
  @Test
  void testApplicationContext() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    Assertions.assertNotNull(applicationContext);
  }
}
