package com.demo;

import com.demo.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        SpringBean1 springBean1=context.getBean(SpringBean1.class);
        springBean1.print();
    }
}
