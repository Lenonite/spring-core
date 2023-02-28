package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("dragon")//@QuestType(type = QuestType.Type.Dragon)
public class SlyingDragonQuest implements Quest {
    public String goQuest() {
        return "Knight killed the dragon";
    }
}
