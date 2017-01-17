package com.zlove.main.decorator;

/**
 * Created by ZLOVE on 17/1/4.
 */
public class Casquette extends HatDecorator {

    Person person;

    public Casquette(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return person.getDescription() + " a casquette";
    }

    @Override
    public float cost() {
        return 75 + person.cost();
    }
}
