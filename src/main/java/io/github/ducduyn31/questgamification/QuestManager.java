package io.github.ducduyn31.questgamification;

import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.events.EventsManager;
import io.github.ducduyn31.questgamification.quests.events.create.QuestCreatedEvent;
import io.github.ducduyn31.questgamification.utils.EventNotifier;

import java.util.ArrayList;

public class QuestManager {
    private static QuestManager ourInstance = new QuestManager();

    public static QuestManager getInstance() {
        return ourInstance;
    }

    private EventsManager eventsManager;
    private ArrayList<Quest> quests;

    private QuestManager() {
        eventsManager = new EventsManager();
        quests = new ArrayList<>();
    }

    public void registerQuest(Quest quest) {
        EventNotifier.notifyQuestEvent(new QuestCreatedEvent(quest));
    }

    public void removeQuest(Quest quest) {
        this.quests.remove(quest);
    }

    public EventsManager getEventManager() {
        return this.eventsManager;
    }


}
