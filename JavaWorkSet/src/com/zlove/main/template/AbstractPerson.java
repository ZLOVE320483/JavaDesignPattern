package com.zlove.main.template;

/**
 * Created by ZLOVE on 17/1/15.
 */
public abstract class AbstractPerson {

    public void prepareGotoSchool() {
        dressUp();
        eatBreakfast();
        takeThings();
    }

    protected abstract void dressUp();
    protected abstract void eatBreakfast();
    protected abstract void takeThings();

}
