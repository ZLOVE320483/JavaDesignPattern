package com.zlove.main.adapter;

import java.awt.*;

/**
 * Created by ZLOVE on 17/1/9.
 */
public class GPSCar extends Car implements GPS {


    @Override
    public Point getLocation() {
        Point point = new Point();
        point.setLocation(super.getSpeed(), super.getSpeed());
        return point;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("，坐标：(" + getLocation().x + "，" + getLocation().y + ")");
        return sb.toString();
    }
}
