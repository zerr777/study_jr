package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.parallelSort(mas);
        for (int ls : mas)
            System.out.println(ls);
        //напишите тут ваш код
    }
}
