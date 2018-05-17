package io.github.ducduyn31.questgamification.quests.events.update;

import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.QuestKey;

public class QuestDescriptionUpdateEvent extends QuestUpdateEvent {

    private String newDescription;

    public QuestDescriptionUpdateEvent(Quest quest, String value) {
        super(quest, QuestKey.DESCRIPTION, value);
    }

    public QuestDescriptionUpdateEvent(Quest quest) {
        super(quest, QuestKey.DESCRIPTION, null);
        this.newDescription = quest.getDescription();
    }

    public String getNewDescription() {
        return this.newDescription;
    }

    public void setNewDescription(String newDescription) {
        super.setChangedValue(QuestKey.DESCRIPTION, newDescription);
    }
}
