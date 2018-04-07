package quests.events.update.create;

import quests.Quest;
import quests.events.QuestEvent;

public class QuestCreatedEvent extends QuestEvent {
    public QuestCreatedEvent(Quest quest) {
        super(quest);
    }
}
