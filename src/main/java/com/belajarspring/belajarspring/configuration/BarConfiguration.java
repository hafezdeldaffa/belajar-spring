package com.belajarspring.belajarspring.configuration;

import com.belajarspring.belajarspring.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

  @Bean
  public Bar bar() {
    return new Bar();
  }
}
