package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[3];
        for (int i = 0; i < mas.length ; i++) {
            mas[i] = Integer.parseInt(reader.readLine());

        }
        if (mas[1] == mas[2] && mas[0] != mas[1])
            System.out.println(1);
        if (mas[0] == mas[2] && mas[1] != mas[2])
            System.out.println(2);
        if (mas[0] == mas[1] && mas[2] != mas[1])
            System.out.println(3);
        //напишите тут ваш код
    }
}
