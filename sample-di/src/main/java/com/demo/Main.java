package com.demo;

import com.demo.beans.GreatMatrimonyQuest;
import com.demo.beans.Knight;
import com.demo.beans.RescuingDimselQuest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.setQuest(new GreatMatrimonyQuest());
        System.out.println(knight.goQuest());
    }
}
