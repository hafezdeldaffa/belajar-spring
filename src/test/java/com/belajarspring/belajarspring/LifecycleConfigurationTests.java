package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Connection;
import com.belajarspring.belajarspring.data.LifecycleConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleConfigurationTests {
  private ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
  }

  @Test
  void testConnection() {
    Connection connection = applicationContext.getBean(Connection.class);
  }
}
