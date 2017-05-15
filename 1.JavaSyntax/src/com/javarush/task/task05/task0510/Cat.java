package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name,address,color;
    int age,weight;

    public void initialize(String name){
        this.name = name;
        this.age = 8;
        this.weight = 8;
        this.color = "null";
    }
    public void initialize(String name, int weight,int age){
        this.name = name;
        this.age = age;
        this.weight=weight;
        this.color="null";
    }
    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 8;
        this.color="null";
    }
    public void initialize(int weight,String color){
        this.age=8;
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight,String color,String address){
        this.age = 8;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
