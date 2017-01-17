package com.zlove.main.iterator;

import java.util.ArrayList;

/**
 * Created by ZLOVE on 17/1/17.
 */
public class ScienceLessons {

    private ArrayList<String> lessons;

    public ScienceLessons() {
        lessons = new ArrayList<>();
        addLessons("Physical");
        addLessons("Chemical");
        addLessons("Biological");
    }

    private void addLessons(String lesson) {
        lessons.add(lesson);
    }

    public ArrayList getLessons() {
        return lessons;
    }

    public Iterator<String> createIterator() {
        return new ScienceIterator(lessons);
    }
}
