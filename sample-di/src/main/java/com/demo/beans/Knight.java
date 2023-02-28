package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Knight {
    @Autowired
    @Qualifier("dragon")//@QuestType(type=QuestType.Type.Dragon)
    private Quest quest;
//    @Autowired
//    private Myclass myclass;

//    public Knight(Optional<Myclass> myclass,Quest quest) {
//        this.quest = quest;
////        this.myclass = myclass;
//    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest(){

        return quest.goQuest();
    }
    @Autowired
    public void setSpringBean(List<MyInterface> list){

    }
}
