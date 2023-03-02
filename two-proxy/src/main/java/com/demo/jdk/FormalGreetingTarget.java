package com.demo.jdk;

public class FormalGreetingTarget  implements Greeting{
    @Override
    public String greet(String name) {
        return "Hello " +name;
    }
}
