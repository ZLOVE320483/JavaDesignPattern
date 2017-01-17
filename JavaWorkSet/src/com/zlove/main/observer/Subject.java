package com.zlove.main.observer;

/**
 * Created by ZLOVE on 17/1/3.
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
