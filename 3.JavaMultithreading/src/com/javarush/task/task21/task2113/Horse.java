package com.javarush.task.task21.task2113;

/**
 * Created by Озеров on 09.06.2017.
 */
public class Horse {
    String name;
    double speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {

        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public Horse(String name, double speed, double distance) {

        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    double distance;
}
