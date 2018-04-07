package quests.events;

import java.util.ArrayList;

public class EventsManager {

    private ArrayList<EventListener> listeners = new ArrayList<>();

    public EventsManager() {
    }

    public ArrayList<EventListener> getListeners() {
        return listeners;
    }

    public void registerListener(EventListener listener) {
        this.listeners.add(listener);
    }
}
