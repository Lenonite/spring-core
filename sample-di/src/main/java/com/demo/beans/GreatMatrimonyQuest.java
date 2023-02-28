package com.demo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//@QuestType(type = QuestType.Type.Matrimont)
public class GreatMatrimonyQuest implements Quest{

    @Override
    public String goQuest() {
        return "Knight and Princess performs the great Matrimony!";
    }
}
