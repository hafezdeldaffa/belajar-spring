package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Slf4j
public class ScopeConfiguration {

  @Bean
  @Scope("prototype")
  public Foo foo() {
    log.info("Create new foo");
    return new Foo();
  }
}
