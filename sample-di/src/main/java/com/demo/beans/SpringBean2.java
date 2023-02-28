package com.demo.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component @Order(2)
public class SpringBean2  implements MyInterface{
    public SpringBean2() {
        System.out.println("sprongbean2");
    }
}
