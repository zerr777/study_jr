package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[3];
        int plus = 0;
        int minus = 0;
        for (int i = 0; i < 3; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
            if (mas[i] > 0)
                plus++;
            else if (mas[i] < 0) minus++;
        }
        System.out.println("количество отрицательных чисел: " + minus);
        System.out.println("количество положительных чисел: " + plus);

        //напишите тут ваш код

    }
}
