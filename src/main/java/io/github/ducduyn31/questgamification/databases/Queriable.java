package io.github.ducduyn31.questgamification.databases;

import java.util.function.Predicate;

public interface Queriable<T> {
    T findOne(Predicate predicate);

    T[] find(Predicate predicate);
}
