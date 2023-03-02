package com.demo;

import com.ocpsoft.pretty.time.PrettyTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:/application.properties")
public class AppConfig {

    @Bean
    public PrettyTime prettyTime(){
         return new PrettyTime();
    }
}
