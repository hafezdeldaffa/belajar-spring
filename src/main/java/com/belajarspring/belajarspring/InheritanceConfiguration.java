package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
