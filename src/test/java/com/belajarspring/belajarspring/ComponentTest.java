package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.repository.CategoryRepository;
import com.belajarspring.belajarspring.repository.ProductRepository;
import com.belajarspring.belajarspring.service.CategoryService;
import com.belajarspring.belajarspring.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
  ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void componentTest() {
    ProductService productService1 = applicationContext.getBean(ProductService.class);
    ProductService productService2 = applicationContext.getBean("productService" ,ProductService.class);

    Assertions.assertSame(productService1, productService2);
  }

  @Test
  void constructorDependencyInjectionTest() {
    ProductService productService = applicationContext.getBean(ProductService.class);
    ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

    Assertions.assertSame(productRepository, productService.getProductRepository());
  }

  @Test
  void testSetterDependencyInjection() {
    CategoryService categoryService = applicationContext.getBean(CategoryService.class);
    CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

    Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
  }
}
