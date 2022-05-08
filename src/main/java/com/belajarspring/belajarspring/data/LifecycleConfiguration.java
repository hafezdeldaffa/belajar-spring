package com.belajarspring.belajarspring.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {

  @Bean
  public Connection connection() {
    return new Connection();
  }
}
