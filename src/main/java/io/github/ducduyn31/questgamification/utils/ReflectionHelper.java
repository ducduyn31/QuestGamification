package io.github.ducduyn31.questgamification.utils;

import io.github.ducduyn31.questgamification.quests.Quest;
import io.github.ducduyn31.questgamification.quests.QuestKey;

import java.lang.reflect.Field;

public class ReflectionHelper {
    public static void changeQuestPrivateField(Quest context, QuestKey key, String newValue) {
        try {
            Field f = Quest.class.getDeclaredField(key.getName());
            f.setAccessible(true);
            f.set(context, newValue);
            f.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
