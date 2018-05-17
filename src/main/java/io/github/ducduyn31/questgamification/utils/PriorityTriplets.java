package io.github.ducduyn31.questgamification.utils;

import java.lang.reflect.Method;
import java.util.*;

public class PriorityTriplets extends PriorityQueue<Triplet> {

    public PriorityTriplets() {
        super((o1, o2) -> o2.getValue() - o1.getValue());
    }

    public boolean add(Method method, int level, Object context) {
        return super.add(new Triplet(method, level, context));
    }

    @Override
    public boolean add(Triplet triplet) {
        return super.add(triplet);
    }
}