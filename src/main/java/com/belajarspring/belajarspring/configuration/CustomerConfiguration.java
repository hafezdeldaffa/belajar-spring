package com.belajarspring.belajarspring.configuration;

import com.belajarspring.belajarspring.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

  @Bean
  public CustomerRepository normalCustomerRepository() {
    return new CustomerRepository();
  }

  @Bean
  public CustomerRepository premiumCustomerRepository() {
    return new CustomerRepository();
  }
}
