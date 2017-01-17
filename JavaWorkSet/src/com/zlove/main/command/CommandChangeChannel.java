package com.zlove.main.command;

/**
 * Created by ZLOVE on 17/1/8.
 */
public class CommandChangeChannel implements Command {

    private Television myTv;
    private int channel;

    public CommandChangeChannel(Television myTv, int channel) {
        this.myTv = myTv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        myTv.changeChannel(channel);
    }
}
