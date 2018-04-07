package quests.events.update;

public interface AuthorUpdateEvent {

    String getPreviousAuthor();
    String getNewAuthor();
}
