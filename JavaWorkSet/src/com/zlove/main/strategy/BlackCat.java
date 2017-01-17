package com.zlove.main.strategy;

import com.zlove.main.strategy.behavior.GoodCatchBehavior;

/**
 * Created by ZLOVE on 16/12/27.
 */
public class BlackCat extends Cat {

    public BlackCat() {
        catchBehavior = new GoodCatchBehavior();
    }

    @Override
    public void sayMyColor() {
        System.out.println("I am Black");
    }
}
