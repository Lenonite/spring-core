package com.demo.cglib;

import com.demo.jdk.Greeting;

public class Main {

    public static void main(String[] args) {
       MyGreeting greetinProxy=new GreetinProxy();
        System.out.println(greetinProxy.greet("Ag lan thr"));
    }
}
