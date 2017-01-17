package com.zlove.main.command;

/**
 * Created by ZLOVE on 17/1/8.
 */
public class Control {

    private Command onCommand, offCommand, changeCommand;

    public Control(Command onCommand, Command offCommand, Command changeCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.changeCommand = changeCommand;
    }

    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }

    public void changeChannel() {
        changeCommand.execute();
    }
}
