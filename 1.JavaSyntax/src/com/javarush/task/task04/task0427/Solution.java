package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(reader.readLine());
        String out;
        if (s >=1 && s <= 999) {
            out = s % 2 == 0 ? "четное " : "нечетное ";
            out += s >= 100 ?  "трехзначное" : s >= 10 ? "двузначное" : "однозначное";
            out += " число";
            System.out.println(out);

        }
        //напишите тут ваш код

    }
}
