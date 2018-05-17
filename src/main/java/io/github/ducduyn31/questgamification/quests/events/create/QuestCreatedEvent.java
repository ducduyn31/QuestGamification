package io.github.ducduyn31.questgamification.quests.events.create;


import io.github.ducduyn31.questgamification.QuestManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.events.Cancellable;
import io.github.ducduyn31.questgamification.quests.events.QuestEvent;

import java.util.Date;

public class QuestCreatedEvent extends QuestEvent implements Cancellable {

    final static Logger logger = LogManager.getLogger(QuestCreatedEvent.class.getSimpleName());

    private Date createdTime;
    private boolean isCancelled = false;

    public QuestCreatedEvent(Quest quest) {
        super(quest);
        this.createdTime = new Date();
    }

    @Override
    public void cancel() {
        this.isCancelled = true;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }
}
