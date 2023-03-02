package com.belajarspring.belajarspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.belajarspring.belajarspring.service",
        "com.belajarspring.belajarspring.repository",
})
public class ComponentConfiguration {
}
