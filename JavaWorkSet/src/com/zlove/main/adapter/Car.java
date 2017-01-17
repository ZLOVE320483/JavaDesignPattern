package com.zlove.main.adapter;

/**
 * Created by ZLOVE on 17/1/9.
 */
public class Car {
    private String name;
    private double speed;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("车名：" + name + "，");
        sb.append("速度：" + speed + "千米/小时");
        return sb.toString();
    }
}
