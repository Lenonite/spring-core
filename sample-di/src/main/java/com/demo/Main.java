package com.demo;

import com.demo.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                =new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        Person person=context.getBean(Person.class);
        person.setName("THaw Thaw");
        System.out.println("Name: "+person.getName());
    }
}
