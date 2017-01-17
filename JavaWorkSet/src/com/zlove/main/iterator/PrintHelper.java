package com.zlove.main.iterator;

/**
 * Created by ZLOVE on 17/1/17.
 */
public class PrintHelper {
    private LiberalLessons liberalLessons;
    private ScienceLessons scienceLessons;

    public PrintHelper(LiberalLessons liberalLessons, ScienceLessons scienceLessons) {
        this.liberalLessons = liberalLessons;
        this.scienceLessons = scienceLessons;
    }

    public void print() {
        System.out.println("Liberal Lessons : ");
        Iterator<String> liberalIterator = liberalLessons.createIterator();
        print(liberalIterator);
        System.out.println();

        System.out.println("Science Lessons : ");
        Iterator<String> scienceIterator = scienceLessons.createIterator();
        print(scienceIterator);
        System.out.println();


    }

    private void print(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
