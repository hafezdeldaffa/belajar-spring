package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.belajarspring.belajarspring.service",
        "com.belajarspring.belajarspring.repository",
        "com.belajarspring.belajarspring.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
