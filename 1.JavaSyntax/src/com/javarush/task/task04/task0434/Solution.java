package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1, j;
        while (i <= 10){
            j = 1;
            while (j <=10){
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;}
        //напишите тут ваш код

    }
}
