package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DuplicateConfiguration {
  @Bean(value = "fooFirst")
  @Primary
  // Creating primary bean, this bean will use as primary
  public Foo foo1() {
    return new Foo();
  }

  @Bean(value = "fooSecond")
  public Foo foo2() {
    return new Foo();
  }
}
