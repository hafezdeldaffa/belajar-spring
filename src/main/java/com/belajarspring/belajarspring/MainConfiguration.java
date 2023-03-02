package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.configuration.BarConfiguration;
import com.belajarspring.belajarspring.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
