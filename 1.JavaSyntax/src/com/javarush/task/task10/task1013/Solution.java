package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human kids;
        private long weight;
        private double tall;

        public Human(String name, int age, Human kids) {
            this.name = name;
            this.age = age;
            this.kids = kids;
        }

        public Human() {
        }

        public Human(String name, boolean sex, long weight, double tall) {

            this.name = name;
            this.sex = sex;
            this.weight = weight;
            this.tall = tall;
        }

        public Human(String name, boolean sex, Human kids) {

            this.name = name;
            this.sex = sex;
            this.kids = kids;
        }

        public Human(String name, boolean sex, int age, Human kids, long weight, double tall) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.kids = kids;
            this.weight = weight;
            this.tall = tall;
        }

        public Human(String name, boolean sex, int age, Human kids, long weight) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.kids = kids;
            this.weight = weight;
        }

        public Human(String name, boolean sex, int age, Human kids) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.kids = kids;
        }

        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex) {

            this.name = name;
            this.sex = sex;
        }

        public Human(String name) {

            this.name = name;
        }
        // напишите тут ваши переменные и конструкторы
    }
}
