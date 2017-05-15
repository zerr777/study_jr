package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        double a = 0;
        int count = 0;
        while (i != -1) {
            i = Integer.parseInt(reader.readLine());
            if (i != -1) {
                a += i;
                count++;
            }
            else System.out.println(a / count);


        }
        //напишите тут ваш код
    }
}

