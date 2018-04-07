import org.junit.Test;
import quests.Quest;
import quests.QuestObjective;

public class DatabaseUnitTest {

    @Test
    public void connectToMongoDB() {

    }

    public static void main(String[] args) {
        QuestManager.getInstance().getEventManager().registerListener(new EventUnitTest());
        QuestManager.getInstance().registerQuest(new Quest("Slime Eradication", "Exterminate slimes, \"for 300 years.", "Morita\n", new QuestObjective(2000)));
    }
}
