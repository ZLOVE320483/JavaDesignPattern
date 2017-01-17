package com.zlove.main.iterator;

/**
 * Created by ZLOVE on 17/1/17.
 */
public class LiberalLessons {

    public static final int MAX_LESSONS = 3;
    private int numberOfLessons = 0;
    private String[] lessons;

    public LiberalLessons() {
        lessons = new String[MAX_LESSONS];
        addLessons("Political");
        addLessons("Geography");
        addLessons("History");
    }

    private void addLessons(String lesson) {
        lessons[numberOfLessons] = lesson;
        numberOfLessons++;
    }

    public String[] getLessons() {
        return lessons;
    }

    public Iterator<String> createIterator() {
        return new LiberalIterator(lessons);
    }
}
