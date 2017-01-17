package com.zlove.main.strategy.behavior;

/**
 * Created by ZLOVE on 16/12/27.
 */
public class BadCatchBehavior implements Behavior {

    @Override
    public void catchFish() {
        System.out.println("I can not catch fish...");
    }
}
