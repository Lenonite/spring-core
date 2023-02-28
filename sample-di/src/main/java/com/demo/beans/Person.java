package com.demo.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@ComponentScan
@Component
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
