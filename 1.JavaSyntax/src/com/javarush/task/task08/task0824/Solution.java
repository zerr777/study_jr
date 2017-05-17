package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> ch = new ArrayList();
        ch.add(new Human("Vas1", true, 10));
        ch.add(new Human("Vas2", false, 14));
        ch.add(new Human("Vas3", true, 13));

        ArrayList<Human> fz = new ArrayList();
        ArrayList<Human> mz = new ArrayList();
        fz.add(new Human("Vas", true, 45, ch));
        mz.add(new Human("Vasy", false, 40, ch));

        ArrayList<Human> gr = new ArrayList<>();
        gr.add(new Human("Vas", true, 70, fz));
        gr.add(new Human("Vas", false, 70, mz));
        gr.add(new Human("Vas", true, 70, fz));
        gr.add(new Human("Vas", false, 70, mz));

        for (Human g : gr)
            System.out.println(g);
        for (Human f : fz)
            System.out.println(f);
        for (Human m : fz)
            System.out.println(m);
        for (Human c : ch)
            System.out.println(c);

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();
        //напишите тут ваш код

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
