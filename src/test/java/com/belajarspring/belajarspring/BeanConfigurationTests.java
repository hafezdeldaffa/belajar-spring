package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigurationTests {
  @Test
  void testCreateBean() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Foo.class);

    Assertions.assertNotNull(applicationContext);
  }

  @Test
  void testGetBean() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Foo.class);

    Foo foo1 = applicationContext.getBean(Foo.class);
    Foo foo2 = applicationContext.getBean(Foo.class);

    Assertions.assertSame(foo1, foo2);
  }
}
