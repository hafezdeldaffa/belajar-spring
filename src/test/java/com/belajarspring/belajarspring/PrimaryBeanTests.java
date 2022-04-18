package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTests {
  @Test
  void testPrimaryBean() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

    Foo fooPrimary = applicationContext.getBean(Foo.class);

    Assertions.assertNotNull(fooPrimary);
  }
}
