package io.github.ducduyn31.questgamification.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class StringUtils {

    public static String prettifyJsonLikeObject(String jsObject) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(jsObject);

        return gson.toJson(je);
    }

    public static String acceptAlphabetAndNumber(String raw) {
        return raw.replaceAll("[^A-Za-z0-9 ,.]", "");
    }
}
