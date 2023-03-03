package com.belajarspring.belajarspring.configuration;

import com.belajarspring.belajarspring.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PaymentGatewayClientFactoryBean.class})
public class FactoryConfiguration {
}
