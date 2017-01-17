package com.zlove.main.template;

/**
 * Created by ZLOVE on 17/1/15.
 */
public class Teacher extends AbstractPerson {

    @Override
    protected void dressUp() {
        System.out.println("穿上工作服。。。");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("照顾孩子一起吃早饭。。。");
    }

    @Override
    protected void takeThings() {
        System.out.println("带上教案，公文包，去学校上班。。。");
    }
}
