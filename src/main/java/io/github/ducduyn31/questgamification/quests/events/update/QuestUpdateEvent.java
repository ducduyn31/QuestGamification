package io.github.ducduyn31.questgamification.quests.events.update;

import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.QuestKey;
import io.github.ducduyn31.questgamification.quests.events.Cancellable;
import io.github.ducduyn31.questgamification.quests.events.QuestEvent;
import io.github.ducduyn31.questgamification.utils.ReflectionHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuestUpdateEvent extends QuestEvent implements Cancellable {

    private static final Logger logger = LogManager.getLogger(QuestUpdateEvent.class.getSimpleName());

    private boolean isCancelled = false;
    protected String value;
    private QuestKey key;

    public QuestUpdateEvent(final Quest quest, final QuestKey key, final String value) {
        super(quest);
        setChangedValue(key, value);
    }

    @Override
    public void cancel() {
        this.isCancelled = true;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    public String getChangedValue() {
        return value;
    }

    public void setChangedValue(QuestKey key, String newValue) {

        this.key = key;
        this.value = newValue;
        switch (key) {
            case AUTHOR:
                ReflectionHelper.changeQuestPrivateField(this.getQuest(), QuestKey.AUTHOR, newValue);
                break;
            case DESCRIPTION:
                ReflectionHelper.changeQuestPrivateField(this.getQuest(), QuestKey.DESCRIPTION, newValue);
                break;
            case NAME:
                ReflectionHelper.changeQuestPrivateField(this.getQuest(), QuestKey.NAME, newValue);
                break;
            case OBJECTIVES:
                break;
        }
    }

    public QuestKey getChangedKey() {
        return key;
    }
}

