package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTests {
  ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
  }

  @Test
  void testFooNames() {
    Foo foo1 = applicationContext.getBean("fooFirst", Foo.class);
    Foo foo2 = applicationContext.getBean("fooSecond", Foo.class);

    Assertions.assertNotSame(foo1, foo2);
  }
}
