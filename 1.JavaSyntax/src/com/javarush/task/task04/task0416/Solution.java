package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        if (t % 5 == 0)
            System.out.println("зелёный");
        else if (t % 5 >= 4)
            System.out.println("красный");
        else if (t % 5 >= 3)
            System.out.println("желтый");
        else System.out.println("зелёный");

        //напишите тут ваш код
    }
}