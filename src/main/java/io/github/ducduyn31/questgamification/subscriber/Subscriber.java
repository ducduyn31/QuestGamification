package io.github.ducduyn31.questgamification.subscriber;

import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.events.subscribe.QuestSubscribedEvent;
import io.github.ducduyn31.questgamification.utils.EventNotifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    private static final Logger logger = LogManager.getLogger(Subscriber.class.getSimpleName());

    private List<Quest> quests;

    public Subscriber() {
        this.quests = new ArrayList<>();
    }

    public void subscribe(Quest quest) {
        EventNotifier.notifyQuestEvent(new QuestSubscribedEvent(quest, this));
    }

    public void unsubscribe(Quest quest) {
        this.quests.remove(quest);
    }

    public void unsubscribeAll() {
        this.quests.clear();
    }
}
