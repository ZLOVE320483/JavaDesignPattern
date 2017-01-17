package com.zlove.main.template;

/**
 * Created by ZLOVE on 17/1/15.
 */
public class Student extends AbstractPerson {

    @Override
    protected void dressUp() {
        System.out.println("穿上校服。。。");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("吃麻麻做的早饭。。。");
    }

    @Override
    protected void takeThings() {
        System.out.println("背上书包，系上红领巾，上学啦。。。");
    }
}
