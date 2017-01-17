package com.zlove.main.iterator;

/**
 * Created by ZLOVE on 17/1/17.
 */
public class LiberalIterator implements Iterator<String> {

    private String[] lessons;
    private int position = 0;

    public LiberalIterator(String[] lessons) {
        this.lessons = lessons;
    }

    @Override
    public boolean hasNext() {
        if (position >= lessons.length) {
            return false;
        }
        return true;
    }

    @Override
    public String next() {
        String lesson = lessons[position];
        position += 1;
        return lesson;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You can not remove element !");
    }
}
