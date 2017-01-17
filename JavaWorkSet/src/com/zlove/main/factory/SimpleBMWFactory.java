package com.zlove.main.factory;

/**
 * Created by ZLOVE on 17/1/8.
 */
public class SimpleBMWFactory {

    private BMW myBmw;

    public void createBMW(int type) {

        switch (type) {
            case 320:
                myBmw = new BMW320();
                myBmw.create();
                break;

            case 523:
                myBmw = new BMW523();
                myBmw.create();
                break;

            default:
                break;
        }
    }
}
