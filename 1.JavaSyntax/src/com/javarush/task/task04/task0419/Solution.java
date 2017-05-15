package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static int max (int x, int y){
        if (x > y)
            return x;
        else return y;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int max;
        max = a >= b ? a : b;
        max = max >= c ? max : c;
        max = max >= d ? max : d;
        System.out.println(max);
        //напишите тут ваш код
    }
}
