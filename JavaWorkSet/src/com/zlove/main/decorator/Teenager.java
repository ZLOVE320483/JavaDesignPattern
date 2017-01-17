package com.zlove.main.decorator;

/**
 * Created by ZLOVE on 17/1/4.
 */
public class Teenager extends Person {

    public Teenager() {
        description = "Shop List:";
    }

    @Override
    public float cost() {
        return 0;
    }
}
