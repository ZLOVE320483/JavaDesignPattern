package com.zlove.main.command;

/**
 * Created by ZLOVE on 17/1/8.
 */
public class CommandOff implements Command {

    private Television myTv;

    public CommandOff(Television myTv) {
        this.myTv = myTv;
    }

    @Override
    public void execute() {
        myTv.turnOff();
    }
}
