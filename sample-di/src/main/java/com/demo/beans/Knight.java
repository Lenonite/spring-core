package com.demo.beans;

public class Knight {
    private Quest quest;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest(){
        return quest.goQuest();
    }
}
