package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Connection;
import com.belajarspring.belajarspring.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleConfigurationTests {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
  }

  @AfterEach
  void tearDown() {
    applicationContext.close();
  }

  @Test
  void testConnection() {
    Connection connection = applicationContext.getBean(Connection.class);
  }

  @Test
  void testServer() {
    Server server = applicationContext.getBean(Server.class);
  }
}
