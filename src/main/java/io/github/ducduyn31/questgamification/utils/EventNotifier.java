package io.github.ducduyn31.questgamification.utils;

import io.github.ducduyn31.questgamification.QuestManager;
import io.github.ducduyn31.questgamification.quests.events.Cancellable;
import io.github.ducduyn31.questgamification.quests.events.QuestEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;

public class EventNotifier {

    private final static Logger logger = LogManager.getLogger(EventNotifier.class.getSimpleName());

    public static void notifyQuestEvent(QuestEvent e) {
        logger.debug(e.getClass().getSimpleName() + " fired");

        QuestManager.getInstance().getEventManager().getListeners().stream()
                .filter(triplet -> triplet.getMethod().getParameterTypes()[0].equals(e.getClass()) || triplet.getMethod().getParameterTypes()[0].isInstance(e))
                .forEach(triplet -> {
                    logger.debug(triplet.getMethod().getName() + " is using event " + e.getClass().getSimpleName());
                    if (e instanceof Cancellable) {
                        if (!((Cancellable) e).isCancelled()) {
                            try {
                                triplet.getMethod().invoke(triplet.getContext(), e);

                                //getSubEvents(triplet.getMethod().getParameterTypes()[0]);
                            } catch (IllegalAccessException | InvocationTargetException e1) {
                                e1.printStackTrace();
                            }
                        }
                    } else {
                        try {
                            triplet.getMethod().invoke(triplet.getContext(), e);
                        } catch (IllegalAccessException | InvocationTargetException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
    }
}
