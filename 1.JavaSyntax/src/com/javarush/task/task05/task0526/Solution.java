package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 =new Man("Vasya" , 30,"Spb");
        Man man2 =new Man("Vasya2" , 31,"Spb");
        Woman woman1 = new Woman("Zina", 27, "Spb");
        Woman woman2 = new Woman("Zina2", 27, "Spb");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        //напишите тут ваш код
    }
    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
    //напишите тут ваш код
}
