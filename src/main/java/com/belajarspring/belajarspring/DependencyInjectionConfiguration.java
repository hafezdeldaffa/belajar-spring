package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Bar;
import com.belajarspring.belajarspring.data.Foo;
import com.belajarspring.belajarspring.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {
  @Bean
  public Foo foo () {
    return new Foo();
  }

  @Bean()
  public Foo foo1 () {
    return new Foo();
  }

  @Bean
  public Bar bar() {
    return  new Bar();
  }

  @Bean
  public FooBar fooBar(@Qualifier("foo1") Foo foo, Bar bar) {
    return new FooBar(foo, bar);
  }
}
