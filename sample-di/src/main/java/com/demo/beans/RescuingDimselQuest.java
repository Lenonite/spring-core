package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("dimsel")//@QuestType(type = QuestType.Type.Dimsel)
public class RescuingDimselQuest implements Quest{
    public String goQuest(){
        return "knight is going to save dimesel";
    }
}
