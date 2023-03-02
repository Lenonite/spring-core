package com.demo.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component @Order(1)
public class SpringBean3  implements  MyInterface{
    public SpringBean3() {

        //System.out.println("Spring Bean3");
    }
    public String toString(){
        return "Springbean3";
    }




}
