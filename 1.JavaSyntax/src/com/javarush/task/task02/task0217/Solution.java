package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        return (min(a, b) < min(c, d)) ? min(a, b) : min(c, d);
        //напишите тут ваш код

    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}