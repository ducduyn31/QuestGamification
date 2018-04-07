package quests;

public class QuestObjective {

    private int timeLimit;

    public QuestObjective() {
    }

    public QuestObjective(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return "{" +
                "\"timeLimit\":" + timeLimit +
                '}';
    }
}
