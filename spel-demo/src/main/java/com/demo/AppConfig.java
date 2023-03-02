package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@PropertySource("classpath:/application.properties")
public class AppConfig {
    @Bean
    public ConversionService conversionService(){
        return  new DefaultConversionService();
    }
}
