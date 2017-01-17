package com.zlove.main.iterator;

import java.util.ArrayList;

/**
 * Created by ZLOVE on 17/1/17.
 */
public class ScienceIterator implements Iterator<String> {

    private ArrayList<String> lessons;
    private int position = 0;

    public ScienceIterator(ArrayList<String> lessons) {
        this.lessons = lessons;
    }

    @Override
    public boolean hasNext() {
        if (position >= lessons.size()) {
            return false;
        }
        return true;
    }

    @Override
    public String next() {
        String lesson = lessons.get(position);
        position += 1;
        return lesson;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You can not remove element !");
    }
}
