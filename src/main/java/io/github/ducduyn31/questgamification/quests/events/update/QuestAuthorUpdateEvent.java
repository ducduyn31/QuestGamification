package io.github.ducduyn31.questgamification.quests.events.update;

import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.QuestKey;
import io.github.ducduyn31.questgamification.utils.EventNotifier;

public class QuestAuthorUpdateEvent extends QuestUpdateEvent {

    private String newAuthor;

    public QuestAuthorUpdateEvent(Quest quest, String newAuthor) {
        super(quest, QuestKey.AUTHOR, newAuthor);
        this.newAuthor = newAuthor;
    }

    public QuestAuthorUpdateEvent(Quest quest) {
        super(quest, QuestKey.AUTHOR, null);
        this.newAuthor = quest.getAuthor();
    }

    public String getNewAuthor() {
        return this.newAuthor;
    }

    public void setNewAuthor(String authorName) {
        super.setChangedValue(QuestKey.AUTHOR, authorName);
    }
}
