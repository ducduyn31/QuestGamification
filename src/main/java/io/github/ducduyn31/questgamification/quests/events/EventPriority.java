package io.github.ducduyn31.questgamification.quests.events;

public enum EventPriority {
    HIGHEST(4), HIGH(3), NORMAL(2), LOW(1), LOWEST(0);

    private int level;

    EventPriority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
