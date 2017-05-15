package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int i = 0;
        while (i != -1){
            i = Integer.parseInt(reader.readLine());
            sum += i;
        }
        System.out.println(sum);
        //напишите тут ваш код
    }
}
