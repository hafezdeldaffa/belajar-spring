package com.belajarspring.belajarspring.listener;

import com.belajarspring.belajarspring.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {
    @EventListener
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Success login userListener for user " + event.getUser());
    }
}
