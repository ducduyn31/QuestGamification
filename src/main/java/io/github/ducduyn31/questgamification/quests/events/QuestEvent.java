package io.github.ducduyn31.questgamification.quests.events;

import io.github.ducduyn31.questgamification.quests.Quest;

public abstract class QuestEvent {

    private Quest quest;

    public QuestEvent(Quest quest) {
        this.quest = quest;
    }

    public Quest getQuest() {
        return this.quest;
    }
}
