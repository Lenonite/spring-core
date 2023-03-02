package com.demo;

import com.demo.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        SpringBean1 springBean1=context.getBean(SpringBean1.class);
        SpringBean1 springBean2=context.getBean(SpringBean1.class);
        SpringBean1 springBean3=context.getBean(SpringBean1.class);

        boolean test=springBean1==springBean2;
        System.out.println("bean 1 and bean2 are the same "+test);

        System.out.println(SpringBean1.getCount());


    }
}
