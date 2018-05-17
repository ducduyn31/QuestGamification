package io.github.ducduyn31.questgamification.quests;

import io.github.ducduyn31.questgamification.quests.events.update.QuestAuthorUpdateEvent;
import io.github.ducduyn31.questgamification.utils.EventNotifier;
import io.github.ducduyn31.questgamification.utils.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quest implements Achievable {

    private ArrayList<QuestObjective> objectives;
    private String name;
    private String description;
    private String author;

    public Quest(String name, String description, String author, QuestObjective... objectives) {
        this.objectives = new ArrayList<>(Arrays.asList(objectives));
        this.name = StringUtils.acceptAlphabetAndNumber(name);
        this.description = StringUtils.acceptAlphabetAndNumber(description);
        this.author = StringUtils.acceptAlphabetAndNumber(author);
    }

    @Override
    public ArrayList<QuestObjective> getObjectives() {
        return this.objectives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = StringUtils.acceptAlphabetAndNumber(name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = StringUtils.acceptAlphabetAndNumber(description);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        EventNotifier.notifyQuestEvent(new QuestAuthorUpdateEvent(this, author));
    }

    protected void setAuthorRaw(String author) {
        this.author = StringUtils.acceptAlphabetAndNumber(author);
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + getName() + "\"," +
                "\"author\":\"" + getAuthor() + "\"," +
                "\"description\":\"" + getDescription() + "\"," +
                "\"objectives\":" + Stream.of(objectives).map(objectives1 -> objectives.toString()).collect(Collectors.joining(";")) +
                '}';
    }
}
