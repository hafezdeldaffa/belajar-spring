package com.belajarspring.belajarspring.service;

import com.belajarspring.belajarspring.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Lazy
public class ProductService {

  @Getter
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name) {
    this.productRepository = productRepository;
  }
}
