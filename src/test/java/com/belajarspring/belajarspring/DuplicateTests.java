package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTests {
  @Test
  void testDuplicate() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

    Foo foo1 = applicationContext.getBean("foo1", Foo.class);
    Foo foo2 = applicationContext.getBean("foo2", Foo.class);

    Assertions.assertNotSame(foo1, foo2);
  }
}
