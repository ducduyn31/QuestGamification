package io.github.ducduyn31.questgamification.utils;

import java.lang.reflect.Method;

public class Triplet {
    private Method method;
    private int value;
    private Object context;

    public Triplet(Method method, Integer value, Object context) {
        this.method = method;
        this.value = value;
        this.context = context;
    }

    public Object getContext() {
        return context;
    }


    public Method getMethod() {
        return method;
    }

    public int getValue() {
        return value;
    }
}
