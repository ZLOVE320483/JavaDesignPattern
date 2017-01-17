package com.zlove.main.observer;

/**
 * Created by ZLOVE on 17/1/3.
 */
public class StatisticsDisplay implements Observer, DisplayElement {


    private float temperature; // 温度
    private float humidity; // 湿度
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println("temperature --- " + temperature + ", humidity --- " + humidity + ", pressure --- " + pressure);
    }
}
