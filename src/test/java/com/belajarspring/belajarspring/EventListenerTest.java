package com.belajarspring.belajarspring;

import com.belajarspring.belajarspring.listener.LoginSuccessListener;
import com.belajarspring.belajarspring.listener.UserListener;
import com.belajarspring.belajarspring.processor.FooBeanFactoryPostProcessor;
import com.belajarspring.belajarspring.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {
    @Configuration
    @Import({UserService.class, LoginSuccessListener.class, UserListener.class})
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void eventListenerTest() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("hafezd", "hafezd123");
        userService.login("abdul", "hafezd123");
        userService.login("hafezd", "salah");
    }
}
