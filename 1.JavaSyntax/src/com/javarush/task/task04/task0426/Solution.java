package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0)
            System.out.print(a % 2 == 0 ? "положительное четное число" : "положительное нечетное число");

        else if (a == 0)
            System.out.println("ноль");
        else
            System.out.print( a % 2 == 0 ? "отрицательное четное число" : "отрицательное нечетное число");

        //напишите тут ваш код
    }
}
