package com.zlove.main.factory;

/**
 * Created by ZLOVE on 17/1/8.
 */
public class BMW320Factory implements BMWFactory {

    @Override
    public BMW createBMW() {
        BMW320 bmw320 = new BMW320();
        bmw320.create();
        return bmw320;
    }
}
