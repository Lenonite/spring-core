package com.demo;

import com.demo.beans.SpringBean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class
        );
        context.registerShutdownHook();

//        SpringBean3 springBean3=context.getBean(SpringBean3.class);
    }
}
