import io.github.ducduyn31.questgamification.quests.events.EventHandler;
import io.github.ducduyn31.questgamification.quests.events.EventListener;
import io.github.ducduyn31.questgamification.quests.events.EventPriority;
import io.github.ducduyn31.questgamification.quests.events.create.QuestCreatedEvent;
import io.github.ducduyn31.questgamification.quests.events.subscribe.QuestSubscribedEvent;
import io.github.ducduyn31.questgamification.quests.events.update.QuestAuthorUpdateEvent;
import io.github.ducduyn31.questgamification.quests.events.update.QuestUpdateEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EventUnitTest implements EventListener {

    private static final Logger logger = LogManager.getLogger(EventUnitTest.class);

    @EventHandler(priority = EventPriority.HIGH)
    public void onQuestCreatedEvent(QuestCreatedEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onQuestAuthorEvent(QuestAuthorUpdateEvent event) {

    }

    @EventHandler
    public void onQuestChanged(QuestUpdateEvent event) {

    }

    @EventHandler
    public void onQuestSubscribeTo(QuestSubscribedEvent event) {
        logger.debug(event.getSubscriber());
    }

}
