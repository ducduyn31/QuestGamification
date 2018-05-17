import io.github.ducduyn31.questgamification.QuestManager;
import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.QuestObjective;
import org.junit.Test;

public class DatabaseUnitTest {

    @Test
    public void connectToMongoDB() {

    }

    public static void main(String[] args) {
        QuestManager.getInstance().getEventManager().registerListener(new EventUnitTest());
        QuestManager.getInstance().registerQuest(new Quest("Slime Eradication", "Exterminate slimes, \"for 300 years.", "Morita\n", new QuestObjective(2000)));
    }
}
