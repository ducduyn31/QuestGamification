package io.github.ducduyn31.questgamification.quests.events;

import io.github.ducduyn31.questgamification.utils.PriorityTriplets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class EventsManager {

    private static final Logger logger = LogManager.getLogger(EventsManager.class.getSimpleName());

    private PriorityTriplets listeners = new PriorityTriplets();

    public EventsManager() {
    }

    public PriorityTriplets getListeners() {

        return listeners;
    }

    public void registerListener(EventListener listener) {
        Arrays.stream(listener.getClass().getMethods()).filter(method -> method.getAnnotation(EventHandler.class) != null)
                .forEach(method -> {
                    listeners.add(method, method.getAnnotation(EventHandler.class).priority().getLevel(), listener);
                    logger.debug("Registering " + method.getName());
                });
    }
}
