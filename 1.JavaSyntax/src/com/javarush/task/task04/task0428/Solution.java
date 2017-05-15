package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[3];
        int result = 0;
        for (int i = 0; i < 3; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
            if (mas[i] > 0)
                result++;
        }
        System.out.println(result);
        //напишите тут ваш код

    }
}
