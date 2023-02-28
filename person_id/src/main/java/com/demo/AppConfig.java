package com.demo;

import com.demo.beans.Address;
import com.demo.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class AppConfig {
/*@Bean@Autowired
    public Person person(Address address){
        Person person=new Person();
        person.setAddress(address);
        return person;
    }
    @Bean
    public Address address(){
        return new Address();
    }*/

}
