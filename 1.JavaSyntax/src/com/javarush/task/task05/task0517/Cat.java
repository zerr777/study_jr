package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        this.age = 8;
        this.weight = 8;
        this.color = "null";
    }

    public Cat(String name, int weight, int age) {

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color="null";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 8;
        this.color="null";

    }

    public Cat(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 5;
    }

    public Cat(int weight, String color, String address  ) {
        this.address = address;
        this.color = color;
        this.weight = weight;
        this.age = 5;
    }


    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
