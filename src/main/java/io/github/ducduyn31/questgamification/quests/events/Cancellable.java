package io.github.ducduyn31.questgamification.quests.events;

public interface Cancellable {

    void cancel();

    boolean isCancelled();
}
