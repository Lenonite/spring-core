package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("yoyeyo")//@QuestType(type = QuestType.Type.Yoyeyo)
public class SingYoYeYoQuest implements Quest {

    public String goQuest(){
        return "Knight sings YoYeYo";
    }
}
