package com.javarush.task.task14.task1421;

/**
 * Created by Озеров on 06.06.2017.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }
}
