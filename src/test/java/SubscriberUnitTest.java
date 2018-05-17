import io.github.ducduyn31.questgamification.QuestManager;
import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.QuestObjective;
import io.github.ducduyn31.questgamification.subscriber.Subscriber;

public class SubscriberUnitTest {
    public static void main(String[] args) {
        QuestManager.getInstance().getEventManager().registerListener(new EventUnitTest());
        Quest theQuest = new Quest("Slime Eradication", "Exterminate slimes, \"for 300 years.", "Morita\n", new QuestObjective(2000));
        QuestManager.getInstance().registerQuest(theQuest);
        Subscriber duy = new Subscriber();
        duy.subscribe(theQuest);
    }
}
