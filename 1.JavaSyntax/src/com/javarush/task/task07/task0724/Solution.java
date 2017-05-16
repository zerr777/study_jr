package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/


public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Женя", true, 85);
        Human grandfather2 = new Human("Саша", true, 84);
        Human grandmother1 = new Human("Надя", false, 83);
        Human grandmother2 = new Human("Наталья", false, 81);
        Human fathe = new Human("Ваня", true, 45, grandfather1, grandmother1);
        Human mothe = new Human("Настя", false, 40, grandfather2, grandmother2);
        Human bnuk1 = new Human("Петя", true, 18, fathe, mothe);
        Human bnuk2 = new Human("Юля", false, 17, fathe, mothe);
        Human bnuk3 = new Human("Саша", true, 15, fathe, mothe);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(fathe.toString());
        System.out.println(mothe.toString());
        System.out.println(bnuk1.toString());
        System.out.println(bnuk2.toString());
        System.out.println(bnuk3.toString());


        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) // создаем конструктор класса
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }
        public Human(String name, boolean sex, int age) // еще один конструктор класса для старшего поколения
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















