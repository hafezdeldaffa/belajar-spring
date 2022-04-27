package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class ScopeTests {
  private ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
  }

  @Test
  void testPrototypeScope() {
    Foo foo1 = applicationContext.getBean(Foo.class);
    Foo foo2 = applicationContext.getBean(Foo.class);
    Foo foo3 = applicationContext.getBean(Foo.class);

    Assertions.assertNotSame(foo1, foo2);
    Assertions.assertNotSame(foo2, foo3);
    Assertions.assertNotSame(foo3, foo1);
  }
}
