package quests.events;

import quests.Quest;

public class QuestEvent {

    private Quest quest;

    public QuestEvent(Quest quest) {
        this.quest = quest;
    }

    public Quest getQuest() {
        return this.quest;
    }
}
