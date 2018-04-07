package quests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quest implements Achievable {

    private ArrayList<QuestObjective> objectives;
    private String name;
    private String description;
    private String author;

    public Quest(String name, String description, String author, QuestObjective... objectives) {
        this.objectives = new ArrayList<>(Arrays.asList(objectives));
        this.setName(name);
        this.setDescription(description);
        this.setAuthor(author);
    }

    @Override
    public ArrayList<QuestObjective> getObjectives() {
        return this.objectives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.replaceAll("[^A-Za-z0-9 ,.]", "");

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description.replaceAll("[^A-Za-z0-9 ,.]", "");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author.replaceAll("[^A-Za-z0-9 ,.]", "");;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + getName()  + "\"," +
                "\"author\":\"" + getAuthor() + "\"," +
                "\"description\":\"" + getDescription() + "\"," +
                "\"objectives\":" + Stream.of(objectives).map(objectives1 -> objectives.toString()).collect(Collectors.joining(";")) +
                '}';
    }
}
