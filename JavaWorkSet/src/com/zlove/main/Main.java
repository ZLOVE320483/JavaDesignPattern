package com.zlove.main;

import com.zlove.main.adapter.Car;
import com.zlove.main.adapter.GPSCar;
import com.zlove.main.command.*;
import com.zlove.main.decorator.Casquette;
import com.zlove.main.decorator.Person;
import com.zlove.main.decorator.Shirt;
import com.zlove.main.decorator.Teenager;
import com.zlove.main.facade.Computer;
import com.zlove.main.factory.BMW320Factory;
import com.zlove.main.factory.BMW523Factory;
import com.zlove.main.factory.SimpleBMWFactory;
import com.zlove.main.iterator.LiberalLessons;
import com.zlove.main.iterator.PrintHelper;
import com.zlove.main.iterator.ScienceLessons;
import com.zlove.main.observer.StatisticsDisplay;
import com.zlove.main.observer.WeatherData;
import com.zlove.main.strategy.BlackCat;
import com.zlove.main.strategy.Cat;
import com.zlove.main.strategy.RedCat;
import com.zlove.main.template.AbstractPerson;
import com.zlove.main.template.Student;
import com.zlove.main.template.Teacher;

/**
 * Created by ZLOVE on 16/12/27.
 */
public class Main {

    public static void main(String[] args) {

        //============= Strategy ============

        System.out.println("**************Strategy****************");

        Cat redCat = new RedCat();
        redCat.sayMyColor();
        redCat.shout();
        redCat.run();
        redCat.catchFish();

        System.out.println();

        Cat blackCat = new BlackCat();
        blackCat.sayMyColor();
        blackCat.shout();
        redCat.run();
        blackCat.catchFish();

        //========== Observer =========
        System.out.println("**************Observer****************");
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(16.0f, 120.1f, 130.0f);
        statisticsDisplay.display();
        System.out.println();

        //========== Decorator ===========
        System.out.println("*************Decorator*****************");
        Person person = new Teenager();
        person = new Shirt(person);
        person = new Casquette(person);
        System.out.println(person.getDescription() + " $ " + person.cost());
        System.out.println();

        // ========= Factory ==============
        System.out.println("*************Factory*****************");
        System.out.println("--------简单工厂模式---------");
        SimpleBMWFactory factory = new SimpleBMWFactory();
        factory.createBMW(320);
        factory.createBMW(523);
        System.out.println();

        System.out.println("--------工厂方法模式---------");
        BMW320Factory bmw320Factory = new BMW320Factory();
        bmw320Factory.createBMW();
        BMW523Factory bmw523Factory = new BMW523Factory();
        bmw523Factory.createBMW();
        System.out.println();

        // ========= Command ==============
        System.out.println("*************Command*****************");
        Television myTv = new Television();
        CommandOn on = new CommandOn(myTv);
        CommandOff off = new CommandOff(myTv);
        CommandChangeChannel commandChangeChannel = new CommandChangeChannel(myTv, 2);

        Control control = new Control(on, off, commandChangeChannel);
        control.turnOn();
        control.turnOff();
        control.changeChannel();
        System.out.println();

        // ========= Adapter ==============
        System.out.println("*************Adapter*****************");
        System.out.println("自定义普通的汽车：");
        Car car = new Car();
        car.setName("Audi");
        car.setSpeed(60);
        System.out.println(car);
        System.out.println("自定义GPS汽车：");
        GPSCar gpsCar = new GPSCar();
        gpsCar.setName("Audi");
        gpsCar.setSpeed(60);
        System.out.println(gpsCar);
        System.out.println();

        // ========= Facade ==============
        System.out.println("*************Facade*****************");
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
        System.out.println();

        // ========= Template ==============
        System.out.println("*************Template*****************");
        AbstractPerson student = new Student();
        student.prepareGotoSchool();

        AbstractPerson teacher = new Teacher();
        teacher.prepareGotoSchool();

        // ========= Iterator ==============
        System.out.println("*************Iterator*****************");
        LiberalLessons liberalLessons = new LiberalLessons();
        ScienceLessons scienceLessons = new ScienceLessons();
        PrintHelper printHelper = new PrintHelper(liberalLessons, scienceLessons);
        printHelper.print();
    }

}
