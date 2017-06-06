package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.util.*;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new EmptyStackException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new IOException());
        exceptions.add(new FormatterClosedException());
        exceptions.add(new DataFormatException());
        exceptions.add(new TooManyListenersException());
        exceptions.add(new SecurityException());


        //напишите тут ваш код

    }
}
