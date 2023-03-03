package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.client.PaymentGatewayClient;
import com.belajarspring.belajarspring.configuration.FactoryConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class FactoryTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void factoryBeanTest() {
    PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);
    Assertions.assertNotNull(paymentGatewayClient);
    Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
    Assertions.assertEquals("publicKey", paymentGatewayClient.getPublicKey());
  }
}
