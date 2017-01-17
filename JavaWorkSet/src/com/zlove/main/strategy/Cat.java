package com.zlove.main.strategy;

import com.zlove.main.strategy.behavior.Behavior;

/**
 * Created by ZLOVE on 16/12/27.
 */
public abstract class Cat {

    public Behavior catchBehavior;

    public void shout() {
        System.out.println("miao miao~");
    }

    public void run() {
        System.out.println("I can run...");
    }

    public void catchFish() {
        this.catchBehavior.catchFish();
    }

    public abstract void sayMyColor();

}
