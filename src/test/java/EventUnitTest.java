import quests.events.EventHandler;
import quests.events.EventListener;
import quests.events.update.create.QuestCreatedEvent;

public class EventUnitTest implements EventListener {

    @EventHandler
    public void onQuestUpdateAuthor(QuestCreatedEvent event) {
        System.out.println(event.getClass());
    }
}
