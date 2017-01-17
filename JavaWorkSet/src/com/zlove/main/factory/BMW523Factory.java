package com.zlove.main.factory;

/**
 * Created by ZLOVE on 17/1/8.
 */
public class BMW523Factory implements BMWFactory {

    @Override
    public BMW createBMW() {
        BMW523 bmw523 = new BMW523();
        bmw523.create();
        return bmw523;
    }
}
