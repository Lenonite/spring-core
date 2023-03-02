package com.demo.jdk;

public class VerboseGreetingProxy implements Greeting {

    private FormalGreetingTarget target;

    public VerboseGreetingProxy(FormalGreetingTarget target) {

        this.target = target;
    }

    @Override
    public String greet(String name) {
        return target.greet(name) +"\n"+ """    
                Hey Mate!How are you?
                """;
    }
}
