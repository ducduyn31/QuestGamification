package io.github.ducduyn31.questgamification.quests;

public enum QuestKey {
    AUTHOR("author"), DESCRIPTION("description"), NAME("name"), OBJECTIVES("objectives");

    private final String name;

    QuestKey(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
