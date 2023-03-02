package com.demo.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class SpringBeans2 {
    public SpringBeans2(){
        System.out.println(this.getClass().getSimpleName());
    }
}

