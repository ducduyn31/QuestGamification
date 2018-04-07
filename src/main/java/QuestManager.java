import quests.Quest;
import quests.events.EventHandler;
import quests.events.EventsManager;
import quests.events.QuestEvent;
import quests.events.update.create.QuestCreatedEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class QuestManager {
    private static QuestManager ourInstance = new QuestManager();

    public static QuestManager getInstance() {
        return ourInstance;
    }

    private EventsManager eventsManager;
    private ArrayList<Quest> quests;

    private QuestManager() {
        eventsManager = new EventsManager();
        quests = new ArrayList<>();
    }

    public void registerQuest(Quest quest) {
        this.quests.add(quest);

        notifyQuestEvent(new QuestCreatedEvent());
    }

    public EventsManager getEventManager() {
        return this.eventsManager;
    }

    private void notifyQuestEvent(QuestEvent e) {
        this.getEventManager().getListeners().forEach(listener -> {
            Method[] ms = listener.getClass().getMethods();
            Arrays.stream(ms).filter(method -> method.getAnnotation(EventHandler.class) != null).forEach(method -> {
                if (method.getParameterTypes()[0].equals(e.getClass())) {
                    try {
                        method.invoke(listener, e);
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    } catch (InvocationTargetException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        } );
    }
}
