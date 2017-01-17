package com.zlove.main.decorator;

/**
 * Created by ZLOVE on 17/1/4.
 */
public class Shirt extends ClothingDecorator {

    Person person;

    public Shirt(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return person.getDescription() + "a shirt";
    }

    @Override
    public float cost() {
        return 100 + person.cost();
    }
}
