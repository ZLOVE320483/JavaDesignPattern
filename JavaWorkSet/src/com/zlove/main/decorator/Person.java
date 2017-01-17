package com.zlove.main.decorator;

/**
 * Created by ZLOVE on 17/1/4.
 */
public abstract class Person {

    protected String description = "UnKnown";

    public String getDescription() {
        return description;
    }

    public abstract float cost();
}
