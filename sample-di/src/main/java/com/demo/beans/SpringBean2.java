package com.demo.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component @Order(2)
public class SpringBean2  implements MyInterface,Order{
    public SpringBean2() {

        //System.out.println("sprongbean2");
    }
    public String toString(){
        return "Springbean3";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public int value() {
        return 2;
    }
}
