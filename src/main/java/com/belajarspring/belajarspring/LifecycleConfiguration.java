package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.Connection;
import com.belajarspring.belajarspring.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {

  @Bean
  public Connection connection() {
    return new Connection();
  }

  @Bean(initMethod = "start", destroyMethod = "stop")
  public Server server() {
    return new Server();
  }
}
