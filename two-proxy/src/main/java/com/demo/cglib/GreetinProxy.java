package com.demo.cglib;

public class GreetinProxy extends MyGreeting{

    public String greet(String name){
        return  super.greet(name) +"\n"+"Hey GWy si sr m lh?";
    }
}
