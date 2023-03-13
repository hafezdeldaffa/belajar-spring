package com.belajarspring.belajarspring.processor;

import com.belajarspring.belajarspring.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix ID Generator Processor " + beanName);
        if (bean instanceof IdAware) {
            log.info("Prefix Set ID Generator for Bean " + beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("EL-DRG" + UUID.randomUUID().toString());
        }

        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
