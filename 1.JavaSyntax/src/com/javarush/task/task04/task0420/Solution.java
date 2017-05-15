package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] mas = new Integer[3];
        for (int i = 0; i < 3; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mas , Collections.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.print(mas[i] + " ");
        }
        //напишите тут ваш код
    }
}
