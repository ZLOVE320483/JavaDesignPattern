package com.zlove.main.command;

/**
 * Created by ZLOVE on 17/1/8.
 */
public class CommandOn implements Command {

    private Television myTv;

    public CommandOn(Television myTv) {
        this.myTv = myTv;
    }

    @Override
    public void execute() {
        myTv.turnOn();
    }
}
