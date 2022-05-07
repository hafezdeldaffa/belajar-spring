package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Bar;
import com.belajarspring.belajarspring.data.Foo;
import com.belajarspring.belajarspring.data.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
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

  @Bean
  public CustomScopeConfigurer customScopeConfigurer() {
    CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
    customScopeConfigurer.addScope("doubleton", new DoubletonScope());
    return customScopeConfigurer;
  }

  @Bean
  @Scope("doubleton")
  public Bar bar() {
    log.info("Create new bar");
    return new Bar();
  }
}
