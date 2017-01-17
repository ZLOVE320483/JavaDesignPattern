package com.zlove.main.iterator;

/**
 * Created by ZLOVE on 17/1/17.
 */
public interface Iterator<E> {

    boolean hasNext();
    E next();
    void remove();
}
