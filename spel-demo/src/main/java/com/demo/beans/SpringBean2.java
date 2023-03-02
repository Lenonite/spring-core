package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean2")
public class SpringBean2 {
    @Value("reading")
    public String hobby;
}
