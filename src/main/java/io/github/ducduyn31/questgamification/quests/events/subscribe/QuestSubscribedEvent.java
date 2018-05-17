package io.github.ducduyn31.questgamification.quests.events.subscribe;

import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.events.Cancellable;
import io.github.ducduyn31.questgamification.quests.events.QuestEvent;
import io.github.ducduyn31.questgamification.subscriber.Subscriber;

public class QuestSubscribedEvent extends QuestEvent implements Cancellable {

    private Subscriber subscriber;
    private boolean cancelled = false;

    public QuestSubscribedEvent(Quest quest, Subscriber subscriber) {
        super(quest);
        this.subscriber = subscriber;
    }

    public Subscriber getSubscriber() {
        return this.subscriber;
    }

    @Override
    public void cancel() {
        this.cancelled = true;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }
}
