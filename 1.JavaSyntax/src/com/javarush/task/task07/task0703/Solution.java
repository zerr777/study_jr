package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[10];
        int[] q = new int[10];
        for (int i = 0; i < 10; i++) {
            s[i] = reader.readLine();
        }
        for (int i = 0; i < s.length; i++) {
            q[i] = s[i].length();
            System.out.println(q[i]);
        }
        //напишите тут ваш код
    }
}
