package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component @Order(1)
public class SpringBean1 implements Ordered,MyInterface{

    public SpringBean1() {
        System.out.println("SPringBEan1");

    }

    @Override
    public int getOrder() {
        return 1;
    }
}
