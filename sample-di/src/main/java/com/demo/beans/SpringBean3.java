package com.demo.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component @Order(3)
public class SpringBean3  implements  MyInterface{
    public SpringBean3() {
        System.out.println("Spring Bean3");
    }
}
