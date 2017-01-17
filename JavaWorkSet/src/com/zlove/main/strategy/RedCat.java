package com.zlove.main.strategy;

import com.zlove.main.strategy.behavior.BadCatchBehavior;

/**
 * Created by ZLOVE on 16/12/27.
 */
public class RedCat extends Cat {

    public RedCat() {
        catchBehavior = new BadCatchBehavior();
    }

    @Override
    public void sayMyColor() {
        System.out.println("I am Red...");
    }
}
