package com.javarush.task.task13.task1309;

/* 
Наследование интерфейса
*/

public class Solution {
    public interface Movable {
        public Double speed();
    }
    public interface Flyable extends Movable {
        public Double speed(Flyable flyable);
    }
    public static void main(String[] args) throws Exception {
    }
}